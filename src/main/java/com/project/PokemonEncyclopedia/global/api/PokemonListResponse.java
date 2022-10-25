package com.project.PokemonEncyclopedia.global.api;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PokemonListResponse {

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Result {

        private String name;

    }

    private List<Result> results;

}
