package com.shortlist.shoppingcart.domain;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToMany
	@JoinTable(name = "cart_item", joinColumns = @JoinColumn(name = "item_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private Set<Item> items;

	@OneToOne(mappedBy = "cart")
	private User user;

	private String createdBy;

	private String updateBy;

	private LocalDateTime createdOn;

	private LocalDateTime updatedOn;

}
