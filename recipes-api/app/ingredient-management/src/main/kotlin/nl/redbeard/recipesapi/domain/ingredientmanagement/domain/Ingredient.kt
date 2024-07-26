package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Ingredients")
data class Ingredient(
    @Id
    val id: String? = null,
    val name: String,
    val nutrition: Nutrition
)

fun Ingredient.toDTO() = IngredientDTO(
    name = name
)

fun IngredientDTO.toDomain() = Ingredient(
    name = name,
    nutrition = Nutrition()
)