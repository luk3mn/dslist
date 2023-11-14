package com.luke.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luke.dslist.dto.GameMinDTO;
import com.luke.dslist.entities.Game;
import com.luke.dslist.repositories.GameRepository;

@Service // to register GameService as a system Component 
public class GameService {
    
    @Autowired // to inject GameRepository into GameService
    private GameRepository gameRepository;
    
    public List<GameMinDTO> findAll() {

        // var result = gameRepository.findAll(); => We can also use this instead of List<Game> result = ...
        List<Game> result = gameRepository.findAll(); // convert to a game list
        return result.stream().map(x -> new GameMinDTO(x)).toList(); // convert to GameMinDTo and return as a list
    }
}
