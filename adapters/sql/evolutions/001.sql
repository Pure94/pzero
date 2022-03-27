--liquibase formatted sql

create sequence hibernate_sequence;

create TABLE movie
(
  id                   BIGINT                  PRIMARY KEY,
  backdrop_path        VARCHAR(255),
  budget               DOUBLE(12,12),
  homepage             VARCHAR(255),
  tmdb_id              VARCHAR(255)            NOT NULL,
  imdb_id              VARCHAR(255),
  oryginal_title       VARCHAR(255),
  release_date         VARCHAR(255),
  status               VARCHAR(255),
  title                VARCHAR(255)            NOT NULL,
  runtime              INT(5),
  vote_average_tmdb    DOUBLE(12,12),
  vote_count_tmdb      DOUBLE(12,12),
  popularity_tmdb      DOUBLE(12,12),
  overview             TEXT,
  last_tmdb_update     TIMESTAMP WITH TIME ZONE NOT NULL,
  adult                BOOLEAN,
);

--rollback DROP TABLE movie;
--rollback DROP SEQUENCE hibernate_sequence;