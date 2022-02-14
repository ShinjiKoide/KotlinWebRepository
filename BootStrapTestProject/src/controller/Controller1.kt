package dummy.nodomain.controller

import dummy.nodomain.ThymeleafUser
import io.ktor.locations.*
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.thymeleaf.*
import dummy.nodomain.dao.User
import javax.management.modelmbean.ModelMBean


fun Route.exRouting(){
    val user = User()
    // io.ktor.locations#get
    get("/hoge/hige/hage"){
        call.respond(ThymeleafContent("index2", mapOf("user" to user)))
    }

    get("/user"){
//        val user = User()
        call.respond(ThymeleafContent("index2", mapOf("user" to user)))
    }
}