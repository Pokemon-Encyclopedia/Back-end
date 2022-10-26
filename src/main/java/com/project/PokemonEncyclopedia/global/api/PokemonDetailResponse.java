package com.project.PokemonEncyclopedia.global.api;


import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDetailResponse {

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Sprites {

        private String front_default;
        private String back_default;

    }

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Type {

        private String name;
    }
    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Types {

        private Type type;

    }

    private Sprites sprites;
    private List<Types> types;

}
