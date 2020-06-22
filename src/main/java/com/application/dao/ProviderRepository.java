package com.application.dao;


import com.application.model.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "providers")
@Repository
public interface ProviderRepository extends JpaRepository<Provider, Integer> {
}
