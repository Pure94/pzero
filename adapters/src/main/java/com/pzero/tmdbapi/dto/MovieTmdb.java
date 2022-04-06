package com.pzero.tmdbapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class MovieTmdb {

    @JsonProperty("adult")
    private Boolean adult;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("budget")
    private Double budget;

    @JsonProperty("genres")
    private List<GenreTmdb> genres;

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

}


