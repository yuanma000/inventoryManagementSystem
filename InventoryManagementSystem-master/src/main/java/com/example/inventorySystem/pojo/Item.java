package com.example.inventorySystem.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	private int itemId;
	private String name;
	private int amount;
	private double price;

	public int getItemId() { return itemId; }
	public void setItemId(int itemId) { this.itemId = itemId; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public int getAmount() { return amount; }
	public void setAmount(int amount) { this.amount = amount; }

	public double getPrice() { return price; }
	public void setPrice(double price) { this.price = price; }

}

