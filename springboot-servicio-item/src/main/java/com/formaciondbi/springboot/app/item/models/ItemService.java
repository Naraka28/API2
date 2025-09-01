package com.formaciondbi.springboot.app.item.models;

import java.util.List;

public interface ItemService {
	public List<Item> findAll();
	public Item FindById(Long id, Integer cantidad);
}
