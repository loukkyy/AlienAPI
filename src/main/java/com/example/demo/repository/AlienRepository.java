package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens", path = "aliens")
@CrossOrigin
public interface AlienRepository extends JpaRepository<Alien, Long> {
	
	List<Alien> findByName(@Param("name") String name);
	
	/*@Override
	@RestResource(exported = false)
	void deleteById(Long aLong);*/
}
