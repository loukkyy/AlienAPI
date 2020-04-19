package com.example.demo.repository;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

import com.example.demo.model.Alien;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RepositoryEventHandler(Alien.class)
@Component
public class AlientEventHandler {
     
    @HandleBeforeCreate
    public void handleAuthorBeforeCreate(Alien alien){
        log.info("Inside Alien Before Create....");
        String name = alien.getName();
    }
 
    @HandleAfterCreate
    public void handleAuthorAfterCreate(Alien alien){
    	log.info("Inside Alien After Create ....");
        String name = alien.getName();
    }
 
    @HandleBeforeDelete
    public void handleAuthorBeforeDelete(Alien alien){
    	log.info("Inside Alien Before Delete ....");
        String name = alien.getName();
    }
 
    @HandleAfterDelete
    public void handleAuthorAfterDelete(Alien alien){
    	log.info("Inside Alien After Delete ....");
        String name = alien.getName();
    }
}