package com.project.PokemonEncyclopedia.domain.pokemon.service;

import com.project.PokemonEncyclopedia.domain.pokemon.Pokemon;
import com.project.PokemonEncyclopedia.domain.pokemon.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    @Transactional(readOnly = true)
    public Pokemon findPokemonById(Long id) {
        return pokemonRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("포켓몬이 없습니다"));
    }

}
