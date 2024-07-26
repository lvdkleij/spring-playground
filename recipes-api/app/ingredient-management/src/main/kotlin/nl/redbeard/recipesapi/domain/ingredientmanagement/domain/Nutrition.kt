package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

data class Nutrition(
    val kcal: Number? = null,
    val fat: Fat? = null,
    val proteins: Number? = null,
    val fiber: Number? = null,
)
