package com.example.productorderservice.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
interface ProductRepository extends JpaRepository<Product, Long> {

}
