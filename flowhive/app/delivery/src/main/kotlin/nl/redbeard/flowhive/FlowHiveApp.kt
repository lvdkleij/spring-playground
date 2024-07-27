package nl.redbeard.flowhive

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class FlowHiveApp

fun main(args: Array<String>) {
    runApplication<FlowHiveApp>(*args)
}
