package com.project.PokemonEncyclopedia.domain.pokemon.repository;

import com.project.PokemonEncyclopedia.domain.pokemon.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
