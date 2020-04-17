package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Weapon {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToOne
	private Alien alien;
}
