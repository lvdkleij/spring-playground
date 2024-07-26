package nl.redbeard.recipesapi

import org.springframework.context.annotation.ComponentScan

@ComponentScan(basePackages = [
    "nl.redbeard.recipesapi.domain.ingredientmanagement",
    "nl.redbeard.recipesapi.domain.recipemanagement",
    "nl.redbeard.recipesapi.domain.shared",
    "nl.redbeard.recipesapi.web.graphql",
])
class ModuleScanning