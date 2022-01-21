package com.eduanlima.dscatolog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduanlima.dscatolog.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
