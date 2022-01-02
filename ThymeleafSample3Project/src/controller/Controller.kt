package dummy.nodomain.controller

import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.routing.*
import io.ktor.response.*
import io.ktor.thymeleaf.*

fun Route.xRoute(){
    // io.ktor.locations#get
    get("/hoge"){
        call.respondText { "hogehoge" }
    }
    // io.ktor.routing#get
    @Location("/user/{userName}/{userAge}/uri")
    data class User(val userName: String, val userAge: String)

    get<User>({param ->
        val list: MutableList<User> = mutableListOf()
        list.add(User("山田太郎", "35"))
        list.add(User("山田花子", "30"))
        list.add(User("山田ポチ", "10"))
        call.respond(ThymeleafContent("index2", mapOf("results" to list)))
    })
}