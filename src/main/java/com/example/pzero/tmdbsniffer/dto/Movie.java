package com.example.pzero.tmdbsniffer.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie {

    @JsonProperty("adult")
    private Boolean adult;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("budget")
    private Double budget;

    @JsonProperty("genres")
    private List<Genre> genres;

    @JsonProperty("homepage")
    private String homepage;

    @JsonProperty("id")
    private String tmdbId;

    @JsonProperty("imdb_id")
    private String imdbId;

    @JsonProperty("original_title")
    private String originalTitle;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("runtime")
    private Integer runtime;

    @JsonProperty("status")
    private String status;

    @JsonProperty("title")
    private String title;

    @JsonProperty("vote_average")
    private Double voteAverageTmdb;

    @JsonProperty("vote_count")
    private Double voteCountTmdb;

    @JsonProperty("popularity")
    private Double popularityTmdb;

    @JsonProperty("overview")
    private String overviewTmdb;

    @JsonIgnore
    private LocalDate lastTmdbUpdate;

    @JsonIgnore
    private UUID uuid;
}


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Genre {
    private Integer id;
    private String name;
}
