package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

interface GetIngredientById {
    fun execute(id: String): Result<Ingredient>
}