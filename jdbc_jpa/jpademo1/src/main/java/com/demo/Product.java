package com.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entity : database table
@Entity
@Table(name="product")
public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name = "id")
		private int productId;
		
		@Column(name = "name")
		private String productName;
		
		@Column(name = "price")
		private double productPrice;
		
		public Product() {}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}

		public Product(String productName, double productPrice) {
			super();
			this.productName = productName;
			this.productPrice = productPrice;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
					+ "]";
		}
		
		

		
		
		
}
