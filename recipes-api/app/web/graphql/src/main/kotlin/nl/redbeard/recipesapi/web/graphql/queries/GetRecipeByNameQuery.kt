package nl.redbeard.recipesapi.web.graphql.queries

import nl.redbeard.recipesapi.domain.shared.acl.GetIngredientByIdACL
import nl.redbeard.recipesapi.domain.shared.acl.GetRecipeByNameACL
import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO
import nl.redbeard.recipesapi.domain.shared.dto.RecipeDTO
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.BatchMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GetRecipeByNameQuery(
    private val getRecipeByName: GetRecipeByNameACL,
    private val getIngredientById: GetIngredientByIdACL
) {

    @QueryMapping
    fun getRecipeByName(@Argument name: String): RecipeDTO = runCatching {
        getRecipeByName.getRecipeByName(name).getOrThrow()
    }.getOrThrow()
}