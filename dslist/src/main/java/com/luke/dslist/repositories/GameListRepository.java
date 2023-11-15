package com.luke.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luke.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
