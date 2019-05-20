package com.shortlist.shoppingcart.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shortlist.shoppingcart.domain.Item;
import com.shortlist.shoppingcart.exception.ResourceNotFoundException;
import com.shortlist.shoppingcart.repository.ItemRepository;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemRepository itemRepository;

	@Override
	public Item add(Item i) {
		return itemRepository.save(i);
	}

	@Override
	public Item update(Item i) {
		return itemRepository.save(i);
	}

	@Override
	public Collection<Item> findAll() {
		return itemRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		itemRepository.deleteById(id);
	}

	@Override
	public Item fetchById(Long id) {
		return itemRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
	}

}
