package ifpb.edu.br.gabriel.crud.service;

import ifpb.edu.br.gabriel.crud.domain.Game;
import ifpb.edu.br.gabriel.crud.exception.GameNotFoundException;
import ifpb.edu.br.gabriel.crud.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import static ifpb.edu.br.gabriel.crud.exception.ExceptionUtil.throwExceptionIf;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {
    private GameRepository repository;

    public Game create(Game imovel) {
        return repository.save(imovel);
    }

    public Game findById(Integer id) {
        return repository.findById(id)
                .orElseThrow(GameNotFoundException::new);
    }

    public List<Game> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        throwExceptionIf(!repository.existsById(id), new GameNotFoundException());
        repository.deleteById(id);
    }

    public Game update(Game game) {
        throwExceptionIf(!repository.existsById(game.getId()), new GameNotFoundException());
        return repository.save(game);
    }
}