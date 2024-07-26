package nl.redbeard.recipesapi.domain.shared.acl

import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO
import nl.redbeard.recipesapi.domain.shared.dto.IngredientInputDTO

interface SaveIngredientACL {
    fun execute(ingredient: IngredientInputDTO): Result<IngredientDTO>
}