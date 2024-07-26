package nl.redbeard.recipesapi.domain.ingredientmanagement.repositories

import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.Ingredient
import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.SaveIngredient
import org.springframework.stereotype.Service

@Service
class SaveIngredientImpl(
    private val repository: IngredientRepository
): SaveIngredient {
    override fun execute(ingredient: Ingredient): Result<Ingredient> = runCatching {
       repository.save(ingredient)
    }
}