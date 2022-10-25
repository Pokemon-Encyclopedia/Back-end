package com.project.PokemonEncyclopedia.global.api;

import com.project.PokemonEncyclopedia.domain.pokemon.Pokemon;
import com.project.PokemonEncyclopedia.domain.pokemon.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class PokemonFeignService {

    private final PokemonListFeign pokemonListFeign;
    private final PokemonRepository pokemonRepository;

    @Transactional
    public void execute() {

        List<Pokemon> pokemons = new ArrayList<>();

        pokemonListFeign.execute(
                151
        ).getResults().forEach(it -> {
            Pokemon pokemon = Pokemon.builder()
                    .name(it.getName())
                    .build();

            pokemons.add(pokemon);
        });

        pokemonRepository.saveAll(pokemons);
    }
}
