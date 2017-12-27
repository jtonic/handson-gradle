package ro.jtonic.handson.gradle

import io.kotlintest.matchers.shouldNotBe
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit4.SpringRunner

/**
 * Created by Antonel Ernest Pazargic on 27/12/2017.
 * @author Antonel Ernest Pazargic
 */
@RunWith(SpringRunner::class)
@SpringBootTest(classes = [App::class], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class MySpringBootTest {

    @LocalServerPort
    private var port: Int = 0

    @Autowired
    private lateinit var appCtx: ApplicationContext


    @Test
    fun `test that spring context is not null`() {
        appCtx shouldNotBe null
    }
}