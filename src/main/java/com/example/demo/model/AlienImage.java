package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class AlienImage {
	
	@Id 
	@GeneratedValue
	private Long id;
	private String name;
	private String url;
	
}
