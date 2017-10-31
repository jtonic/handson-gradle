package ro.jtonic.handson.gradle.core

import org.springframework.stereotype.Component
import ro.jtonic.handson.gradle.times

/**
 * Created by Antonel Ernest Pazargic on 30/10/2017.
 * @author Antonel Ernest Pazargic
 */
@Component
class PrintingHandler {

    fun handle(msg: String = "not passed") {
        println("=" * 80)
        println("$msg is handled...")
        println("=" * 80)
    }
}