package nl.redbeard.recipesapi.domain.shared.acl

import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO

interface SaveIngredientACL {
    fun execute(ingredient: IngredientDTO): Result<IngredientDTO>
}