package jpa.demo.controller;

import jpa.demo.model.Category;
import jpa.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jpa.demo.model.User;
import jpa.demo.service.DemoService;

import java.util.List;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	/**
     * GET /users/{userId}
     * [x] working fine
     * @param
     * @return
     */
    @GetMapping("/users/{userId}")
    @ResponseBody
    public ResponseEntity<List<?>> getUserByUserId(
            @PathVariable("userId") String userId) {
    	List<?> response = demoService.getUserDetailsbyUserId(userId);
    	
    	return new ResponseEntity<>(response, HttpStatus.OK);
    }
//	/**
//     * GET /carts/{cartId}
//     * [x] working fine
//     * @param processDefKey
//     * @return
//     */
//    @GetMapping("/carts/{cartId}")
//    @ResponseBody
//    public ResponseEntity<String> cartDetailsbyCartId(
//            @PathVariable("userId") String cartId) {
//    	var response = demoService.cartDetailsbyCartId(cartId);
//    	
//    	return new ResponseEntity<>(response, HttpStatus.OK);
//    }
    
    /**
     * PATCH /users
     * [x] working fine
     * @param
     * @return
     */
    @PatchMapping("/users")
    @ResponseBody
    public ResponseEntity<String> saveUser(@RequestBody User user) {
    	String response = demoService.saveUsertoUserTable(user);
    	
    	return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
