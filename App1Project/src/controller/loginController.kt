package dummy.nodomain.controller

import io.ktor.application.*
import io.ktor.locations.*
import io.ktor.routing.*
import io.ktor.response.*
import io.ktor.thymeleaf.*
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver
import javax.print.attribute.standard.JobOriginatingUserName

fun Route.exRoute(){
    // io.ktor.locations#get
    get("/"){
        call .respond(ThymeleafContent("index", mapOf("dummy" to "dummy")))
    }

    // io.ktor.routing#get
    @Location("/user/{userName}/{userAge}")
    data class User(val userName: String, val userAge: String)
    get<User>({param ->

    })

    post("/hoge"){
        call.respond(ThymeleafContent("index2", mapOf("dummy" to "dummy")))
    }
}