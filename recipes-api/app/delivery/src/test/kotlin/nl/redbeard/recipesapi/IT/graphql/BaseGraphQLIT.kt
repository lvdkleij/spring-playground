package nl.redbeard.recipesapi.IT.graphql

import nl.redbeard.recipesapi.BaseIT
import org.junit.jupiter.api.BeforeEach
import org.springframework.graphql.test.tester.HttpGraphQlTester
import org.springframework.test.web.reactive.server.WebTestClient
import java.time.Duration

abstract class BaseGraphQLIT: BaseIT(){

    fun webTestClientBuilder(): WebTestClient.Builder =
        WebTestClient.bindToServer()
            .baseUrl("http://localhost:${port}/graphql")
            .responseTimeout(Duration.ofSeconds(36000))

    lateinit var graphQlTester: HttpGraphQlTester

    @BeforeEach
    fun beforeEach() {
        val client = webTestClientBuilder().build()
        graphQlTester = HttpGraphQlTester.create(client).mutate().build()
    }
}