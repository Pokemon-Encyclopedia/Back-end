package com.project.PokemonEncyclopedia.domain.pokemon.controller;

import com.project.PokemonEncyclopedia.domain.pokemon.Pokemon;
import com.project.PokemonEncyclopedia.domain.pokemon.repository.PokemonRepository;
import com.project.PokemonEncyclopedia.domain.pokemon.service.PokemonService;
import com.project.PokemonEncyclopedia.global.api.PokemonFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3000")
public class PokemonController {

    private final PokemonFeignService pokemonFeignService;
    private final PokemonRepository pokemonRepository;
    private final PokemonService pokemonService;

    @GetMapping
    public String executeName() {
        pokemonFeignService.execute();
        return "success!";
    }

    @QueryMapping
    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    @QueryMapping
    public Pokemon findPokemonById(@Argument Long id) {
        return pokemonService.findPokemonById(id);
    }
}
