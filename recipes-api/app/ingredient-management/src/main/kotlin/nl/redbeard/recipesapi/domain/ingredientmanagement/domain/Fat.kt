package nl.redbeard.recipesapi.domain.ingredientmanagement.domain

import nl.redbeard.recipesapi.domain.shared.dto.FatDTO

class Fat(
    val saturated: Number?,
    val monoUnsaturated: Number?,
    val polyUnsaturated: Number?,
)

fun Fat.toDTO() = FatDTO(
    saturated = saturated,
    monoUnsaturated = monoUnsaturated,
    polyUnsaturated = polyUnsaturated
)

fun FatDTO.toDomain() = Fat(
    saturated = saturated,
    monoUnsaturated = monoUnsaturated,
    polyUnsaturated = polyUnsaturated
)