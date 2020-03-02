package com.faisal.evaly.repositories;

import com.faisal.evaly.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CategoryRepository extends CrudRepository<Category, Long> {


}
