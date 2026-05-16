package com.jkobura.farkleproject.controller;

import com.jkobura.farkleproject.model.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class GameController {

    private final Map<String, Game> games = new HashMap<>();

    @PostMapping("/games")
    public Game startNewGame(){
        Game game = new Game();
        games.put(game.getGameId(), game);
        return game;
    }

    @GetMapping("/games/{id}")
    public ResponseEntity<Game> getGame(@PathVariable String id) {
        Game game = games.get(id);
        if (game == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(game);
    }



}
