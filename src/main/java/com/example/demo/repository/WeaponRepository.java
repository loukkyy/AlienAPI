package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Weapon;

@RepositoryRestResource(collectionResourceRel = "weapons", path = "weapons")
public interface WeaponRepository extends JpaRepository<Weapon, Long> {

}