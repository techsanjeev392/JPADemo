package jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.demo.model.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer>{

}
