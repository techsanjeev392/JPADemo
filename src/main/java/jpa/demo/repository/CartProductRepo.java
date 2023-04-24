package jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.demo.model.CartProduct;

public interface CartProductRepo extends JpaRepository<CartProduct, Integer>{

}
