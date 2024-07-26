package nl.redbeard.recipesapi.domain.shared.acl

import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO

interface GetIngredientByIdACL {
    fun execute(id: String): Result<IngredientDTO>
}