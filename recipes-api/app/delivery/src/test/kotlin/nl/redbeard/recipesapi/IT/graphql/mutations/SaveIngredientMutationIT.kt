package nl.redbeard.recipesapi.IT.graphql.mutations

import kotlinx.coroutines.test.runTest
import nl.redbeard.recipesapi.IT.graphql.BaseGraphQLIT
import nl.redbeard.recipesapi.domain.shared.dto.CarbohydratesDTO
import nl.redbeard.recipesapi.domain.shared.dto.FatDTO
import nl.redbeard.recipesapi.domain.shared.dto.IngredientInputDTO
import nl.redbeard.recipesapi.domain.shared.dto.NutritionDTO
import org.junit.jupiter.api.Test


class SaveIngredientMutationIT: BaseGraphQLIT() {

    @Test
    fun `should save ingredient`() = runTest {
        val ingredientInput = IngredientInputDTO(
            name = "Milk",
            nutrition = NutritionDTO(
                kcal = 10,
                proteins = 20,
                carbohydrates = CarbohydratesDTO(
                    sugar = 10,
                    fiber = 40
                ),
                fat = FatDTO(
                    saturated = 10,
                )
            )
        )

        graphQlTester
            .documentName("saveIngredientMutation")
            .variable("ingredient", ingredientInput)
            .execute()
            .path("saveIngredient")
            .matchesJson(
                """
                  {"__typename":"Ingredient","name":"Milk","nutrition":{"proteins":20.0,"kcal":10.0,"carbohydrates":{"sugar":10.0,"fiber":40.0},"fat":{"saturated":10.0}}}
                """
                    .trimIndent()
            )
    }

}