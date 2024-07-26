package nl.redbeard.recipesapi.domain.ingredientmanagement.application

import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.GetIngredientById
import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.toDTO
import nl.redbeard.recipesapi.domain.shared.acl.GetIngredientByIdACL
import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO
import org.springframework.stereotype.Service

@Service
class GetIngredientByIdUseCase(
    private val getIngredientById: GetIngredientById
): GetIngredientByIdACL {
    override fun execute(id: String): Result<IngredientDTO> = runCatching {
        getIngredientById.execute(id).map { it.toDTO() }.getOrThrow()
    }
}