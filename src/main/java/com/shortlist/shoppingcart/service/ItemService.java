package com.shortlist.shoppingcart.service;

import java.util.Collection;

import com.shortlist.shoppingcart.domain.Item;

public interface ItemService {

	Item add(Item c);

	Item update(Item c);

	Collection<Item> findAll();

	void deleteById(Long id);

	Item fetchById(Long id);

}
