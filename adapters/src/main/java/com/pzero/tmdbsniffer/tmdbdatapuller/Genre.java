package com.pzero.tmdbsniffer.tmdbdatapuller;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import utils.models.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "genres")
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
class Genre extends AbstractEntity {

    @EqualsAndHashCode.Include
    @Column(name = "tmdb_genre_id", nullable = false)
    private Integer tmdbId;

    @EqualsAndHashCode.Include
    @Column(name = "name", nullable = false)
    private String name;
}