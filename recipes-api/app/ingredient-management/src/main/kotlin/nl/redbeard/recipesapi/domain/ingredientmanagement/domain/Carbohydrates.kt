package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

import nl.redbeard.recipesapi.domain.shared.dto.CarbohydratesDTO

data class Carbohydrates(
    val sugar: Number? = null,
    val fiber: Number? = null
)

fun Carbohydrates.toDTO() = CarbohydratesDTO(
    sugar = sugar,
    fiber = fiber
)

fun CarbohydratesDTO.toDomain() = Carbohydrates(
    sugar = sugar,
    fiber = fiber
)