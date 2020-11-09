package tost.springframework.recipe.mmrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.springframework.recipe.mmrecipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
