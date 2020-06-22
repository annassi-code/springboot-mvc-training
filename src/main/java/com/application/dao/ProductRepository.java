package com.application.dao;


import com.application.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "products")
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
