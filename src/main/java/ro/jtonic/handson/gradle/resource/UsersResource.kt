package ro.jtonic.handson.gradle.resource

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ro.jtonic.handson.gradle.model.User

/**
 * Created by Antonel Ernest Pazargic on 02/11/2017.
 * @author Antonel Ernest Pazargic
 */
@RestController("/users")
class UsersResource {

    @GetMapping(produces = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun getUserById(@RequestParam("id") id: String?) = User("username_$id", "admin")
}