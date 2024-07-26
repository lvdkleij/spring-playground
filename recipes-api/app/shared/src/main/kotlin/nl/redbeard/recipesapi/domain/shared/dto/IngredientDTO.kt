package nl.redbeard.recipesapi.domain.shared.dto

data class IngredientDTO(
    val id: String,
    val name: String,
    val nutrition: NutritionDTO? = null
)