package com.example.models;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
@Repository
/**
 * Created by Yoga2pro on 11/9/2016.
 */
public interface PlatnosciDAO extends CrudRepository<Platnosci,Long> {
}

