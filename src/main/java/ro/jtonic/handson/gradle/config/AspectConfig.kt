package ro.jtonic.handson.gradle.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy

/**
 * Created by Antonel Ernest Pazargic on 30/10/2017.
 * @author Antonel Ernest Pazargic
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
class AspectConfig