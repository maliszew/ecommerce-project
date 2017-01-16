package com.example.models;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Transactional
@Repository
public interface ProductsDAO extends CrudRepository<Products,Long> {

}
