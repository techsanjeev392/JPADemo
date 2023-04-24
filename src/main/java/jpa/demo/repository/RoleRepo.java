package jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jpa.demo.model.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
