package com.faisal.evaly.repositories;

import com.faisal.evaly.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository  extends CrudRepository<RecipeRepository , Long> {


}
