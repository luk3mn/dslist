package com.luke.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luke.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    // Now we are able to use a component query, insert, update and delete whatever we need from sql, but using java 
}
