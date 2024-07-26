package nl.redbeard.recipesapi.domain.shared.acl

import nl.redbeard.recipesapi.domain.shared.dto.RecipeDTO

interface GetRecipeByNameACL {

    fun getRecipeByName(name: String): Result<RecipeDTO>
}