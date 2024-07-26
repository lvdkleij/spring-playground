package nl.redbeard.recipesapi.domain.shared.dto

class NutritionDTO(
    val kcal: Number? = null,
    val fat: FatDTO? = null,
    val proteins: Number? = null,
    val carbohydrates: CarbohydratesDTO? = null
)