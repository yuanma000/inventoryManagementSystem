package com.example.inventorySystem.service;

import com.example.inventorySystem.pojo.Item;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
 
}