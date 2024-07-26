package nl.redbeard.recipesapi.domain.shared.dto

class NutritionDTO(
    val kcal: Number?,
    val fat: FatDTO?,
    val proteins: Number?,
    val fiber: Number?,
    val carbohydrates: CarbohydratesDTO?
)