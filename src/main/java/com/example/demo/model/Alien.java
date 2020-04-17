package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Alien {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToOne
	private AlienImage image;
	@OneToMany(mappedBy = "alien")
	private List<Weapon> weapons;
	
}
