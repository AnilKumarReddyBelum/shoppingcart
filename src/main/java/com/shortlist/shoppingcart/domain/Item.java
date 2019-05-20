package com.shortlist.shoppingcart.domain;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Data
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private Double price;

	private Integer quantity;

	@ManyToMany(mappedBy = "items")
	Set<Cart> carts;

	private String createdBy;

	private String updateBy;

	private LocalDateTime createdOn;

	private LocalDateTime updatedOn;

}
