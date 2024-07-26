package nl.redbeard.recipesapi

import org.springframework.context.annotation.Configuration
import org.testcontainers.containers.MongoDBContainer

@Configuration
class MongoDBTestContainerConfig {

    companion object {
        @JvmStatic
        val mongoDBContainer = MongoDBContainer("mongo:latest")

        init {
            mongoDBContainer.start()
            System.setProperty("spring.data.mongodb.uri", mongoDBContainer.replicaSetUrl)
        }
    }
}