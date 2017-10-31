package ro.jtonic.handson.gradle

import java.util.Optional

/**
 * Created by Antonel Ernest Pazargic on 29/10/2017.
 * @author Antonel Ernest Pazargic
 */

operator fun String.times(i: Int) = this.repeat(i)

fun <T> T.toOptional() = Optional.ofNullable(this)

