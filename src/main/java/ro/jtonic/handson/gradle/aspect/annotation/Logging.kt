package ro.jtonic.handson.gradle.aspect.annotation

import java.lang.annotation.Inherited

/**
 * Created by Antonel Ernest Pazargic on 30/10/2017.
 * @author Antonel Ernest Pazargic
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Inherited
annotation class Logging
