package com.example.inventorySystem.controller;

import java.util.List;

import com.example.inventorySystem.pojo.Item;
import com.example.inventorySystem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/items")
public class ItemController {

	
	@Autowired
	ItemService itemeService;
	
	@GetMapping("")
	public List<Item> getInventoryItemList(){
		return itemeService.getAllItems();
	}
	
	@GetMapping("/get/{item_id}")
	public Item getItem(@PathVariable int item_id) {
		return itemeService.getItemByItemNo(item_id);
	}

	@PutMapping("/put/{item_id}/{updatedQuantity}")
	public void updateItemAmount(@PathVariable int item_id, int updatedQuantity) {
		itemeService.updateItemAmount(item_id, updatedQuantity);
	}

	@PutMapping("/put/{item_id}/{updatedPrice}")
	public void updateItemPrice(@PathVariable int item_id, double updatedPrice) {
		itemeService.updateItemPrice(item_id, updatedPrice);
	}

	@PostMapping("/post")
	public void addItem(@RequestBody Item item) {
		itemeService.addItem(item);
	}
	
	@DeleteMapping("/delete/{item_id}")
	public void deleteItem(@PathVariable int item_id) {
		itemeService.deleteItem(item_id);
	}
}
