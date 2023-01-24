package abhishekkumar.me

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import abhishekkumar.me.plugins.*

fun main() {
    embeddedServer(Netty, port = 8000, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureRouting()
}
