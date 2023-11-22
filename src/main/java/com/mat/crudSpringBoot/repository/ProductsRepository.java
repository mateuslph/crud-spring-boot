package com.mat.crudSpringBoot.repository;

import com.mat.crudSpringBoot.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ProductsRepository extends JpaRepository<Products, UUID> {
}
