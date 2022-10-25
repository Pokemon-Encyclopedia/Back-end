package com.project.PokemonEncyclopedia.domain.pokemon.controller;

import com.project.PokemonEncyclopedia.global.api.PokemonFeignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PokemonController {

    private final PokemonFeignService pokemonFeignService;

    @GetMapping()
    public String executeName() {
        pokemonFeignService.execute();
        return "success!";
    }

}
