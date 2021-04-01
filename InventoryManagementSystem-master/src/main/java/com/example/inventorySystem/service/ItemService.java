package com.example.inventorySystem.service;

import java.util.ArrayList;
import java.util.List;

import com.example.inventorySystem.pojo.Item;
import com.example.inventorySystem.service.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

	@Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(item -> items.add(item));
        return items;
    }

    public Item getItemByItemNo(int item_id) {
        return itemRepository.findOne(item_id);
    }
    
    public void addItem(Item item) {
    	itemRepository.save(item);
     }

    public void deleteItem(int itemId) {
    	itemRepository.delete(itemId);
    }
    
    public void updateItemAmount(int itemId, int amount) {
    	try {
        	Item item = itemRepository.findOne(itemId);
        	item.setAmount(amount);
        	itemRepository.save(item);
    	} catch(IllegalArgumentException e) {
    		
    	}
    }
    public void updateItemPrice(int itemId, double price){
        try {
            Item item = itemRepository.findOne(itemId);
            item.setPrice(price);
            itemRepository.save(item);
        } catch(IllegalArgumentException e) {

        }
    }
}
