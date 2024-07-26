package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

import nl.redbeard.recipesapi.domain.shared.dto.CarbohydratesDTO

data class Carbohydrates(
    val sugar: Number?,
    val fiber: Number?
)

fun Carbohydrates.toDTO() = CarbohydratesDTO(
    sugar = sugar,
    fiber = fiber
)

fun CarbohydratesDTO.toDomain() = Carbohydrates(
    sugar = sugar,
    fiber = fiber
)