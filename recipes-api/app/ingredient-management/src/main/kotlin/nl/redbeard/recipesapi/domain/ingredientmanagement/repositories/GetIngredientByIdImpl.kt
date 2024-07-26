package nl.redbeard.recipesapi.domain.ingredientmanagement.repositories

import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.GetIngredientById
import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.Ingredient
import org.springframework.stereotype.Service

@Service
class GetIngredientByIdImpl(
    private val repository: IngredientRepository
): GetIngredientById {
    override fun execute(id: String): Result<Ingredient> = runCatching {
        repository.findById(id).get()
    }

}