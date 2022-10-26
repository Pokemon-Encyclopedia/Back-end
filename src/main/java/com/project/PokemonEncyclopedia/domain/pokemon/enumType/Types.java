package com.project.PokemonEncyclopedia.domain.pokemon.enumType;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

@Getter
@AllArgsConstructor
public enum Types {

    GLASS("풀"),
    POISON("독"),
    NORMAL("노말"),
    FIRE("불"),
    WATER("물"),
    ELECTRIC("전기"),
    ICE("얼음"),
    FIGHTING("격투"),
    GROUND("땅"),
    FRYING("비행"),
    PSYCHIC("에스퍼"),
    BUG("벌레"),
    ROCK("바위"),
    GHOST("고스트"),
    DRAGON("드레곤");

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static Types findTypes(String value) {
        return Stream.of(Types.values())
                .filter(it  -> it.value.equals(value))
                .findFirst()
                .orElse(null);
    }
}
