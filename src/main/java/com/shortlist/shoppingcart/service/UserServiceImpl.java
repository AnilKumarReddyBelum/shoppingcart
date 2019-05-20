package com.shortlist.shoppingcart.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shortlist.shoppingcart.domain.User;
import com.shortlist.shoppingcart.exception.ResourceNotFoundException;
import com.shortlist.shoppingcart.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User add(User u) {
		return userRepository.save(u);
	}

	@Override
	public User update(User u) {
		return userRepository.save(u);
	}

	@Override
	public Collection<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public User fetchById(Long id) {
		return userRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
	}

}
