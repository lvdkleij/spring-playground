package nl.redbeard.recipesapi

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
    classes = [RecipesApiApplication::class])
@Import(
    MongoDbTestContainerConfig::class
)
abstract class BaseIT