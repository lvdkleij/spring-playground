package nl.redbeard.recipesapi.domain.shared.dto

data class IngredientInputDTO(
    val name: String,
    val nutrition: NutritionDTO?
)