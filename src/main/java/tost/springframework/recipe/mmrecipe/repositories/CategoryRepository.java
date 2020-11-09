package tost.springframework.recipe.mmrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.springframework.recipe.mmrecipe.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
