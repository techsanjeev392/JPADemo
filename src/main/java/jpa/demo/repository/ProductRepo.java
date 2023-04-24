package jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.demo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
