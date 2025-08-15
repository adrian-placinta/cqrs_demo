package com.cqrs_poc.cqrs_app.command.api.repository;

import com.cqrs_poc.cqrs_app.command.api.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
