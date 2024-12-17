package org.example.lesson_11


class Ingredient(
    val id: Int,
    val name: String,
    val measure: String,
    var quantity: Int,
)

class Recipe(
    val id: Int,
    val title: String,
    val icon: String,
    val description: String,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
    val cookingMethod: String,
    var isFavorite: Boolean = false,

    ) {
    fun addIngredient(ingredient: Ingredient) {
        ingredients.add(ingredient)
    }

    fun removeIngredient(ingredient: Ingredient) {
        ingredients.remove(ingredient)
    }

    fun addToFavorite() {
        isFavorite = true
    }

    fun removeFromFavorite() {
        isFavorite = false
    }

    fun calculatePortion(portion: Int): MutableList<Ingredient> {
        val portionCount = ingredients
        for (ingredient in portionCount) {
            ingredient.quantity *= portion
        }
        return portionCount
    }
}

class RecipeCategory(
    val id: Int,
    val icon: String,
    val name: String,
    val description: String,
    val recipes: MutableList<Recipe> = mutableListOf(),
){
    fun addRecipe(recipe: Recipe) {
        recipes.add(recipe)
    }
    fun removeRecipe(recipe: Recipe) {
        recipes.remove(recipe)
    }
}

