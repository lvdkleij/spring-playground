package nl.redbeard.recipesapi.domain.shared.dto

data class FatDTO(
    val saturated: Number? = null,
    val monoUnsaturated: Number? = null,
    val polyUnsaturated: Number? = null,
)