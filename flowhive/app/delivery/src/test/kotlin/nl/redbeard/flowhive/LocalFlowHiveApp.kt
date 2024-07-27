package nl.redbeard.flowhive

import org.springframework.boot.SpringApplication
import nl.redbeard.flowhive.main as appMain


object LocalFlowHiveApp {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.from(::appMain).with().run(*args)
    }
}
