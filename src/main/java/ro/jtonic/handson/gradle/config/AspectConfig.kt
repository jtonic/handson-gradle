package ro.jtonic.handson.gradle.config

import org.springframework.aop.Advisor
import org.springframework.aop.AfterReturningAdvice
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.EnableAspectJAutoProxy
import ro.jtonic.handson.gradle.core.Library

/**
 * Created by Antonel Ernest Pazargic on 30/10/2017.
 * @author Antonel Ernest Pazargic
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
class AspectConfig {

    @Bean
    fun logAdvisor(): Advisor {
        val advice = AfterReturningAdvice { _, method, _, _ ->
            println("This is after returning the call $method ...")
        }

        return NameMatchMethodPointcutAdvisor(advice).apply {
            addMethodName(Library::borrow.name)
            setClassFilter {
                it == Library::class.java
            }
        }
    }
}