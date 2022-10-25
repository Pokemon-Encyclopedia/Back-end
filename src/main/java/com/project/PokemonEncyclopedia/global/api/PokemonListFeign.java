package com.project.PokemonEncyclopedia.global.api;

import com.project.PokemonEncyclopedia.global.config.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokemonList", url = "https://pokeapi.co/api/v2/pokemon", configuration = FeignClientConfiguration.class)
public interface PokemonListFeign {

    @GetMapping()
    public PokemonListResponse execute(@RequestParam(name = "limit") Integer limit);

}
