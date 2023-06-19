package ifpb.edu.br.gabriel.crud.controller;

import ifpb.edu.br.gabriel.crud.domain.Game;
import ifpb.edu.br.gabriel.crud.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/games")
public class GameController {

    private final GameService gameService;

    @PostMapping
    public Game create(@RequestBody Game game) {
        return gameService.create(game);
    }

    @GetMapping(value = {"/{id}"})
    public Game findById(@PathVariable Integer id){
        return gameService.findById(id);
    }

    @GetMapping
    public List<Game> findAll(){
        return gameService.findAll();
    }

    @DeleteMapping(value = {"/{id}"})
    public ResponseEntity<Game> deleteById(@PathVariable Integer id){
        gameService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public Game update(@RequestBody Game imovel){
        return gameService.update(imovel);
    }
}