package tost.springframework.recipe.mmrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.springframework.recipe.mmrecipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
