package com.example.models;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

/**
 * Created by Yoga2pro on 15/1/2017.
 */
@Transactional
@Repository
public interface UsersDAO extends CrudRepository<Products,Long> {
}
