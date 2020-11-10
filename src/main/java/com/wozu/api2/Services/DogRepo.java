package com.wozu.api2.Services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface DogRepo extends CrudRepository<Dog,Long> {

    @Repository
}
