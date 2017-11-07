package ro.jtonic.handson.gradle.core

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * Created by Antonel Ernest Pazargic on 05/11/2017.
 * @author Antonel Ernest Pazargic
 */
@Component
class Library constructor(@Value("\${library.name}") val name: String) {

    fun borrow(bookName: String) {
        println("borrow the book: $bookName from library $name")
    }
}