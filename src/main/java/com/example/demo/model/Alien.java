package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;
import org.springframework.data.rest.core.config.Projection;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
public class Alien {
	@Id
	@GeneratedValue
	private Long id;
//	public @CreatedDate Date createdDate;
//	public @LastModifiedDate Date lastModifiedDate;
	@Audited
	private String name;
	@Min(0)
	@Max(1000)
	private int age;
//	@Temporal(TemporalType.DATE)
//	private Calendar dateOfBirth;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@OneToOne(cascade = CascadeType.ALL)
	private AlienImage image;
	@ManyToMany
	private List<Weapon> weapons;
	
	@OneToOne(mappedBy = "alien")
	private Address address;
	
	static enum Gender {
		MALE, FEMALE;
	}
}

@Projection(name = "noGender", types = { Alien.class }) 
interface AlienProj {
	String getName();
	List<Weapon> getWeapons();
}