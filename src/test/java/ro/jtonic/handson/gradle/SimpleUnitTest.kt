package ro.jtonic.handson.gradle

import io.kotlintest.matchers.shouldBe
import org.junit.Test

/**
 * Created by Antonel Ernest Pazargic on 27/12/2017.
 * @author Antonel Ernest Pazargic
 */
class SimpleUnitTest {

    @Test
    fun `test lambda`() {
        val sum = { a: Int, b: Int -> a + b }
        sum(1, 2) shouldBe 3
    }
}