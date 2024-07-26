package nl.redbeard.recipesapi.IT.graphql

import kotlinx.coroutines.test.runTest
import nl.redbeard.recipesapi.domain.shared.dto.IngredientInputDTO
import org.junit.jupiter.api.Test


class SaveIngredientMutationIT: BaseGraphQLIT() {

    @Test
    fun `should save ingredient`() = runTest {
        val ingredientInput = IngredientInputDTO(
            name = "Milk",
            nutrition = null
        )

        graphQlTester
            .documentName("saveIngredientMutation")
            .variable("ingredient", ingredientInput)
            .execute()
            .path("saveIngredient")
            .matchesJson(
                """
                  {"__typename":"Ingredient", "name":"Milk", "nutrition": null}
                """
                    .trimIndent()
            )
    }

}