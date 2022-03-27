package com.pzero.tmdbsniffer.tmdbdatapuller;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.models.AbstractEntity;

import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "genres")

class Genre extends AbstractEntity {

    @EqualsAndHashCode.Include
    private Integer tmdbId;

    @EqualsAndHashCode.Include
    private String name;
}