package ro.jtonic.handson.gradle

/**
 * Created by Antonel Ernest Pazargic on 29/10/2017.
 * @author Antonel Ernest Pazargic
 */
import io.kotlintest.matchers.should
import io.kotlintest.matchers.startWith
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInfo
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

@Tag("fast")
internal class FirstTest {

    @Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    fun myFirstTest(testInfo: TestInfo) {
        "jtonic" should startWith("jt")
    }

    @ParameterizedTest
    @ValueSource(strings = arrayOf("pazargic jtonic", "pazargic tutye"))
    fun mySecondTest(name: String) {
        name should startWith("pazargic")
    }

}