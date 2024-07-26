package nl.redbeard.recipesapi.domain.ingredientmanagement.application

import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.SaveIngredient
import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.toDTO
import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.toDomain
import nl.redbeard.recipesapi.domain.shared.acl.SaveIngredientACL
import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO
import nl.redbeard.recipesapi.domain.shared.dto.IngredientInputDTO
import org.springframework.stereotype.Service

@Service
class SaveIngredientUseCase(
    private val saveIngredient: SaveIngredient
): SaveIngredientACL {
   override fun execute(ingredient: IngredientInputDTO): Result<IngredientDTO> = runCatching {
        saveIngredient.execute(ingredient.toDomain()).map { it.toDTO() }.getOrThrow()
    }
}