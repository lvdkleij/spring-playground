package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

interface SaveIngredient {
    fun execute(ingredient: Ingredient): Result<Ingredient>
}