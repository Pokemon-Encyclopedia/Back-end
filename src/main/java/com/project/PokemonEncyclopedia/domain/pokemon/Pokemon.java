package com.project.PokemonEncyclopedia.domain.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.PokemonEncyclopedia.domain.pokemon.enumType.Types;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @Column
    @ElementCollection
//    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "types", joinColumns = @JoinColumn(name = "id"))
    private List<String> types = new ArrayList<>();

    private String front_default;

    private String back_default;

}
