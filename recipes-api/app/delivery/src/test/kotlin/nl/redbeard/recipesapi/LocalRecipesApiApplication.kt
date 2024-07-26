package nl.redbeard.recipesapi

import org.springframework.boot.SpringApplication
import nl.redbeard.recipesapi.main as appMain


object LocalRecipesApiApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.from(::appMain).with(
            TestContainersConfig::class.java
        ).run(*args)
    }
}
