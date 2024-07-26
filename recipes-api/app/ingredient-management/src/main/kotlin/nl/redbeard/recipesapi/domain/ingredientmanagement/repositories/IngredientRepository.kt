package nl.redbeard.recipesapi.domain.ingredientmanagement.repositories

import nl.redbeard.recipesapi.domain.ingredientmanagement.domain.Ingredient
import org.springframework.data.mongodb.repository.MongoRepository

interface IngredientRepository : MongoRepository<Ingredient, String>