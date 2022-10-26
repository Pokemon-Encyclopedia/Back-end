package com.project.PokemonEncyclopedia.global.api;

import com.project.PokemonEncyclopedia.global.config.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokemonList", url = "https://pokeapi.co/api/v2/pokemon", configuration = FeignClientConfiguration.class)
public interface PokemonListFeign {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    PokemonListResponse executeName(@RequestParam(name = "limit") Integer limit);

    @GetMapping("/{pokomonId}")
    PokemonDetailResponse executeAll(@PathVariable(name = "pokomonId") String pokemonName);

}
