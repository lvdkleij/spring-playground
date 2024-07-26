package nl.redbeard.recipesapi.domain.recipemanagement.domain

import nl.redbeard.recipesapi.domain.shared.dto.RecipeDTO

data class Recipe(
    val id: String,
    val name: String,
    val steps: RecipeStep,
    val ingredients: List<RecipeIngredient>
)

fun Recipe.toDTO() = RecipeDTO(
    ingredients = emptyList()
)