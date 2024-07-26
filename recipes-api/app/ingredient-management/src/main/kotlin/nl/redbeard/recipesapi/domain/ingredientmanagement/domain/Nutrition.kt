package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

import nl.redbeard.recipesapi.domain.shared.dto.NutritionDTO

data class Nutrition(
    val kcal: Number?,
    val fat: Fat?,
    val proteins: Number?,
    val fiber: Number?,
    val carbohydrates: Carbohydrates?
)

fun Nutrition.toDTO() = NutritionDTO(
    kcal = kcal,
    fat = fat?.toDTO(),
    proteins = proteins,
    fiber = fiber,
    carbohydrates = carbohydrates?.toDTO(),
)

fun NutritionDTO.toDomain() = Nutrition(
    kcal = kcal,
    fat = fat?.toDomain(),
    proteins = proteins,
    fiber = fiber,
    carbohydrates = carbohydrates?.toDomain(),
)