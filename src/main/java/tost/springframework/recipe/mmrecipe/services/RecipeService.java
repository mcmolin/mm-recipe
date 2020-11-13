package tost.springframework.recipe.mmrecipe.services;

import tost.springframework.recipe.mmrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
