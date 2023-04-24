package jpa.demo.model;


import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties("cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartId;
	private Double totalAmount;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_cart" )
	private User user;
	
	@OneToMany(mappedBy = "cart")
	private List<CartProduct> CartProducts;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@JsonIgnore
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@JsonIgnore
	public List<CartProduct> getCartProducts() {
		return CartProducts;
	}

	public void setCartProducts(List<CartProduct> cartProducts) {
		CartProducts = cartProducts;
	}


}
