package ro.jtonic.handson.gradle.core

import org.springframework.stereotype.Component

/**
 * Created by Antonel Ernest Pazargic on 30/10/2017.
 * @author Antonel Ernest Pazargic
 */
@Component
class Cannon : Printing {

    override fun print(msg: String) {
        println("Cannon is printing '$msg'...")
    }
}