package nl.redbeard.recipesapi.domain.recipemanagement.application

import nl.redbeard.recipesapi.domain.shared.acl.GetRecipeByNameACL
import nl.redbeard.recipesapi.domain.shared.dto.RecipeDTO
import org.springframework.stereotype.Service

@Service
class GetRecipeByName: GetRecipeByNameACL {

    override fun getRecipeByName(name: String): Result<RecipeDTO>  = runCatching {
        TODO("Not yet implemented")
    }
}