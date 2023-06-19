package ifpb.edu.br.gabriel.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifpb.edu.br.gabriel.crud.domain.Game;

import java.util.Optional;

@Repository
    public interface GameRepository extends JpaRepository<Game, Integer> {
}