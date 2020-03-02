package com.faisal.evaly.repositories;

import com.faisal.evaly.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface UnitOfMeasureRepository extends CrudRepository<Category , Long> {

}
