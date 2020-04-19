package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
public class Weapon {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@ManyToMany(mappedBy = "weapons")
	private List<Alien> aliens;
}
