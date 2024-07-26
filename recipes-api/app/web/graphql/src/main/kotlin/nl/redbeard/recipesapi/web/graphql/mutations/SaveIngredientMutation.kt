package nl.redbeard.recipesapi.web.graphql.mutations

import nl.redbeard.recipesapi.domain.shared.acl.SaveIngredientACL
import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SaveIngredientMutation(
    private val saveIngredient: SaveIngredientACL
) {

    @MutationMapping
    fun saveIngredient(@Argument ingredient: IngredientDTO): IngredientDTO = runCatching {
        saveIngredient.execute(ingredient).getOrThrow()
    }.getOrThrow()
}