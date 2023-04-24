package jpa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jpa.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	 
	 @Query(value = "SELECT * FROM user_table where user_id=?1", nativeQuery = true)
	 User getuserDetails(String userId);
	

}
