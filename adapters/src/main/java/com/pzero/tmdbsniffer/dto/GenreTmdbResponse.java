package com.pzero.tmdbsniffer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class GenreTmdbResponse {

    private Integer id;
    private String name;
}