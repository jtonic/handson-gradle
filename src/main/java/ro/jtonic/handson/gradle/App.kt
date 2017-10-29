package ro.jtonic.handson.gradle

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

/**
 * Created by Antonel Ernest Pazargic on 29/10/2017.
 * @author Antonel Ernest Pazargic
 */
@SpringBootApplication
class App {

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
    }
}

