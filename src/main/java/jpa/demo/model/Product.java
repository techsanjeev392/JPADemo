package jpa.demo.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Product{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer productId;
	@Column(name = "prodcut_name")
	public String productName;
	private Double price;

	@ManyToOne(fetch = FetchType.EAGER)
	public User seller;

	@ManyToOne(fetch = FetchType.EAGER)
	public Category Category; 
	
	
	@OneToOne(mappedBy = "product")
	public CartProduct cartProduct;


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

	@JsonIgnore
	public User getSeller() {
		return seller;
	}


	public void setSeller(User seller) {
		this.seller = seller;
	}
	@JsonIgnore
	public Category getCategory() {
		return Category;
	}


	public void setCategory(Category category) {
		Category = category;
	}
	public CartProduct getCartProduct() {
		return cartProduct;
	}


	public void setCartProduct(CartProduct cartProduct) {
		this.cartProduct = cartProduct;
	}


	@Override
	public String toString() {
		return "Product{" +
				"productId=" + productId +
				", productName='" + productName + '\'' +
				", price=" + price +
				", seller=" + seller +
				", Category=" + Category +
				", cartProduct=" + cartProduct +
				'}';
	}
}
