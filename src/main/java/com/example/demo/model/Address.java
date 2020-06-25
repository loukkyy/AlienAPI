package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Address {
	
	@Id
	private Long id;
	
	@OneToOne
	@MapsId
	private Alien alien;

}
