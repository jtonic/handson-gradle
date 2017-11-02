package ro.jtonic.handson.gradle

import com.fasterxml.jackson.databind.ObjectMapper
import com.jayway.restassured.RestAssured
import com.jayway.restassured.config.ObjectMapperConfig
import com.jayway.restassured.config.RestAssuredConfig
import com.jayway.restassured.http.ContentType
import io.kotlintest.matchers.shouldBe
import io.kotlintest.matchers.shouldNotBe
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit4.SpringRunner
import ro.jtonic.handson.gradle.model.User

/**
 * Created by Antonel Ernest Pazargic on 02/11/2017.
 * @author Antonel Ernest Pazargic
 */
@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(App::class), webEnvironment = RANDOM_PORT)
class RestAssuredJacksonTest {

    @Autowired
    private lateinit var appCtx: ApplicationContext

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @LocalServerPort
    private var port: Int = 0

    @Before
    fun setUp() {
        RestAssuredConfig.config()
                .objectMapperConfig(
                        ObjectMapperConfig.objectMapperConfig().jackson2ObjectMapperFactory { cls, charset ->
                            objectMapper
                        })

    }

    @Test
    fun test() {
        appCtx shouldNotBe null
        val response = RestAssured
                .given()
                .queryParam("id", "1")
                .contentType(ContentType.JSON)
                .`when`()
                .get("http://localhost:$port/users")
                .then()
                .statusCode(200)
                .extract().`as`(User::class.java)

        response shouldNotBe null
        response.run {
            username shouldBe "username_1"
            role shouldBe "admin"
        }
    }
}