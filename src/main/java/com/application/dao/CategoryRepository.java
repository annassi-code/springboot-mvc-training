package com.application.dao;

import com.application.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "categories")
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
