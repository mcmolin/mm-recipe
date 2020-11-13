package tost.springframework.recipe.mmrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tost.springframework.recipe.mmrecipe.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByUom(String unitOfMeasure);
}
