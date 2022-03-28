package com.pzero.tmdbsniffer.tmdbdatapuller;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import utils.models.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "movie")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
class Movie extends AbstractEntity {

    @Column(name = "adult")
    private Boolean adult;

    @Column(name = "backdrop_path")
    private String backdropPath;

    @Column(name = "budget")
    private Double budget;

    @Column(name = "homepage")
    private String homepage;

    @EqualsAndHashCode.Include
    @Column(name = "tmdb_movie_id", nullable = false)
    private String tmdbId;

    @Column(name = "imdb_movie_id")
    private String imdbId;

    @EqualsAndHashCode.Include
    @Column(name = "original_title", nullable = false)
    private String originalTitle;

    @EqualsAndHashCode.Include
    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "runtime")
    private Integer runtime;

    @Column(name = "status")
    private String status;

    @EqualsAndHashCode.Include
    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "vote_average_tmdb")
    private Double voteAverageTmdb;

    @Column(name = "vote_count_tmdb")
    private Double voteCountTmdb;

    @Column(name = "popularity_tmdb")
    private Double popularityTmdb;

    @Column(name = "overview_tmdb")
    private String overviewTmdb;

    @Column(name = "last_tmdb_update", nullable = false, columnDefinition = "TIMESTAMP WITH TIME ZONE")
    private OffsetDateTime lastTmdbUpdate;
}

