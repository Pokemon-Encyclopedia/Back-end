package com.project.PokemonEncyclopedia.domain.pokemon.controller;

import com.project.PokemonEncyclopedia.domain.pokemon.Pokemon;
import com.project.PokemonEncyclopedia.domain.pokemon.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GraphQLController {

    private final PokemonService pokemonService;

    @QueryMapping
    public List<Pokemon> findAll() {
        return pokemonService.findAll();
    }

}
