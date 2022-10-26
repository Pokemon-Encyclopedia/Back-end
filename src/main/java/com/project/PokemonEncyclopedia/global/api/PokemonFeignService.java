package com.project.PokemonEncyclopedia.global.api;

import com.project.PokemonEncyclopedia.domain.pokemon.Pokemon;
import com.project.PokemonEncyclopedia.domain.pokemon.enumType.Types;
import com.project.PokemonEncyclopedia.domain.pokemon.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class PokemonFeignService {

    private final PokemonListFeign pokemonListFeign;
    private final PokemonRepository pokemonRepository;

    @Transactional
    public void execute() {

        List<Pokemon> pokemons = new ArrayList<>();


        pokemonListFeign.executeName(
                151
        ).getResults().forEach(it -> {
            PokemonDetailResponse response = pokemonListFeign.executeAll(it.getName());
            Pokemon pokemon = Pokemon.builder()
                    .name(it.getName())
                    .types(Collections.singletonList(response.getTypes().toString()))
                    .front_default(response.getSprites().getFront_default())
                    .back_default(response.getSprites().getBack_default())
                    .build();


            System.out.println("response = " + response.getTypes());


            pokemons.add(pokemon);
        });

        pokemonRepository.saveAll(pokemons);

        }
    }

