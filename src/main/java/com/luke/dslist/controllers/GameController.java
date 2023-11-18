package com.luke.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luke.dslist.dto.GameDTO;
import com.luke.dslist.dto.GameMinDTO;
import com.luke.dslist.services.GameService;

// This module in our entrance door from our Rest API
@RestController
@RequestMapping(value = "/games") // path from API
public class GameController {
    

    @Autowired
    private GameService gameService; // GameController need to inject GameService, just as GameService needed to inject GameRepository

    @GetMapping // HTTP method from API
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}") // HTTP method from API
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }
}
