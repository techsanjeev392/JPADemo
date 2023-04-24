package jpa.demo.service;

import java.util.List;
import java.util.Optional;

import jpa.demo.model.Category;
import jpa.demo.model.Product;
import jpa.demo.repository.CategoryRepo;
import jpa.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpa.demo.model.Cart;
import jpa.demo.model.User;
import jpa.demo.repository.CartRepo;
import jpa.demo.repository.UserRepo;

@Service
public class DemoService {
	
	@Autowired
	UserRepo userRepo;
	@Autowired
	CartRepo CartRepo;
	@Autowired
	CategoryRepo categoryRepo;

	@Autowired
	ProductRepo productRepo;
	
	public List<Product> getUserDetailsbyUserId(String userId) {
//		log.info("UserID          :: "+userId);
		List<Product> res = productRepo.findAll();
		return res;
	}
	
	public String saveUsertoUserTable(User user) {
		
		userRepo.save(user);
		return "";
	}
	
	public  String cartDetailsbyCartId(String cartId) {
		Optional<Cart> res = CartRepo.findById(new Integer(cartId));
		return res.toString();
	}

}
