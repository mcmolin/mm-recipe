package tost.springframework.recipe.mmrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.springframework.recipe.mmrecipe.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
