package jpa.demo.model;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties("cartProduct")
public class CartProduct {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	public Integer cpId;
	public Integer quantity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cart_product" )
	public Product product;

	@ManyToOne(fetch = FetchType.EAGER)
	public Cart cart;

	public Integer getCpId() {
		return cpId;
	}

	public void setCpId(Integer cpId) {
		this.cpId = cpId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@JsonIgnore
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	@JsonIgnore
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "CartProduct{" +
				"cpId=" + cpId +
				", quantity=" + quantity +
				", product=" + product +
				", cart=" + cart +
				'}';
	}
}
