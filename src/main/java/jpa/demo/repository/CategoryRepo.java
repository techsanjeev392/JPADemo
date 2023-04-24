package jpa.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import jpa.demo.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
