package ro.jtonic.handson.gradle.core

import org.springframework.stereotype.Component
import ro.jtonic.handson.gradle.aspect.annotation.Logging

/**
 * Created by Antonel Ernest Pazargic on 30/10/2017.
 * @author Antonel Ernest Pazargic
 */
@Logging
@Component
class Logger {

    fun log(msg: String) {
        println("INFO: $msg")
    }
}