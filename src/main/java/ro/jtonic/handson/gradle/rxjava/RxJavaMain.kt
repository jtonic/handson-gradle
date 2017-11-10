package ro.jtonic.handson.gradle.rxjava

import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable

/**
 * Created by Antonel Ernest Pazargic on 08/11/2017.
 * @author Antonel Ernest Pazargic
 */
object RxJavaMain {
    @JvmStatic
    fun main(args: Array<String>) {
        val source = listOf("A", "B", "C").toObservable()
                .filter { it in setOf("A", "B") }
                .subscribeBy(
                        onNext = { println(it) }
                )
    }
}