package ro.jtonic.handson.gradle.core

import org.springframework.stereotype.Component
/**
 * Created by Antonel Ernest Pazargic on 30/10/2017.
 * @author Antonel Ernest Pazargic
 */
@Component
class Cannon : Printing {

    override fun print(msg: String?) =
        if(msg != null) {
            println("Printing '$msg' ..."); msg
        } else null
}

