package ro.jtonic.handson.gradle

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import ro.jtonic.handson.gradle.core.Logger
import ro.jtonic.handson.gradle.core.Printing

/**
 * Created by Antonel Ernest Pazargic on 29/10/2017.
 * @author Antonel Ernest Pazargic
 */
@SpringBootApplication
class App {

    @Autowired
    private lateinit var printer: Printing

    @Autowired
    private lateinit var logger: Logger

    companion object {

        @JvmStatic
        fun main(vararg args: String) {
            SpringApplication.run(App::class.java, *args)
        }
    }

    @Bean
    fun applicationRunner() = ApplicationRunner {
        println("=" * 80)
        println("The hello world spring boot application is running")
        println("=" * 80)

        printer.print("Irina is the best beautiful girl in the world")
        printer.print()

        logger.log("Antonel is the best")
    }
}

