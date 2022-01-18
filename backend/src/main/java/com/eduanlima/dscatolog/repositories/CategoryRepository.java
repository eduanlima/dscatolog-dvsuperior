package com.eduanlima.dscatolog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduanlima.dscatolog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{

}
