package com.stackroute.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Team {
    @Id
	private int productId;
	private String productName;
	private int productCost;
	public Team() {
	}
	public Team(int productId, String teamName, int productCost) {
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}
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
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	@Override
	public String toString() {
		return "Team [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost + "]";
	}
	
	
}
