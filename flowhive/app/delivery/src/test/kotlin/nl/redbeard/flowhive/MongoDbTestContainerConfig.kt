package nl.redbeard.flowhive

import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.springframework.context.annotation.Bean
import org.testcontainers.containers.MongoDBContainer

@TestConfiguration(proxyBeanMethods = false)
class MongoDbTestContainerConfig {

    @Bean
    @ServiceConnection
    fun mongoDbContainer(): MongoDBContainer{
        return  MongoDBContainer("mongo:latest")
    }
}