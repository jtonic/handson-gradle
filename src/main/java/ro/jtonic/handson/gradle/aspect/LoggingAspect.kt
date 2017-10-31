package ro.jtonic.handson.gradle.aspect

import org.aspectj.lang.annotation.AfterReturning
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import ro.jtonic.handson.gradle.core.PrintingHandler

/**
 * Created by Antonel Ernest Pazargic on 30/10/2017.
 * @author Antonel Ernest Pazargic
 */

@Component
@Aspect
class LoggingAspect {

    @Autowired
    private lateinit var handler: PrintingHandler

    @Pointcut("execution (* ro.jtonic.handson.gradle.core.Printing.print(String)) && args(msg)")
    fun pc1(msg: String) {}

    @Pointcut("within(@ro.jtonic.handson.gradle.aspect.annotation.Logging *)")
    fun pc2() {}

    @Pointcut("execution(* *(String)) && args(msg)")
    fun pc3(msg: String) {}

    @AfterReturning(pointcut = "pc1(msg)")
    fun afterReturning1(msg: String) {
        println("After successfully printed.")
        handler.handle(msg)
    }

    @AfterReturning(pointcut = "pc2() && pc3(msg)")
    fun afterReturning2(msg: String) {
        println("After successfully logged.")
        handler.handle(msg)
    }
}