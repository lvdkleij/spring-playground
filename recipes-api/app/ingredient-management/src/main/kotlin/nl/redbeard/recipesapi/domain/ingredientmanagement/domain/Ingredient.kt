package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

import nl.redbeard.recipesapi.domain.shared.dto.IngredientDTO
import nl.redbeard.recipesapi.domain.shared.dto.IngredientInputDTO
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Ingredients")
data class Ingredient(
    @Id
    val id: ObjectId? = null,
    val name: String,
    val nutrition: Nutrition?
)

fun Ingredient.toDTO() = IngredientDTO(
    id = id.toString(),
    name = name,
    nutrition = nutrition?.toDTO()
)

fun IngredientInputDTO.toDomain() = Ingredient(
    name = name,
    nutrition = nutrition?.toDomain()
)

fun IngredientDTO.toDomain() = Ingredient(
    id = ObjectId(id),
    name = name,
    nutrition = nutrition?.toDomain()
)