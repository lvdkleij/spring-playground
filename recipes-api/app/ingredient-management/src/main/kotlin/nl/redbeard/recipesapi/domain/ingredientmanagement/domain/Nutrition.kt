package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

import nl.redbeard.recipesapi.domain.shared.dto.NutritionDTO

data class Nutrition(
    val kcal: Number? = null,
    val fat: Fat? = null,
    val proteins: Number? = null,
    val carbohydrates: Carbohydrates? = null
)

fun Nutrition.toDTO() = NutritionDTO(
    kcal = kcal,
    fat = fat?.toDTO(),
    proteins = proteins,
    carbohydrates = carbohydrates?.toDTO(),
)

fun NutritionDTO.toDomain() = Nutrition(
    kcal = kcal,
    fat = fat?.toDomain(),
    proteins = proteins,
    carbohydrates = carbohydrates?.toDomain(),
)