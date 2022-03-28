--liquibase formatted sql
CREATE TABLE movie
(
  id                   BIGINT                  PRIMARY KEY,
  backdrop_path        VARCHAR(255),
  budget               DOUBLE PRECISION,
  homepage             VARCHAR(255),
  tmdb_movie_id        VARCHAR(255)            NOT NULL,
  imdb_movie_id        VARCHAR(255),
  original_title       VARCHAR(255),
  release_date         VARCHAR(255),
  status               VARCHAR(255),
  title                VARCHAR(255)            NOT NULL,
  runtime              INTEGER,
  vote_average_tmdb    DOUBLE PRECISION,
  vote_count_tmdb      DOUBLE PRECISION,
  popularity_tmdb      DOUBLE PRECISION,
  overview_tmdb        TEXT,
  last_tmdb_update     TIMESTAMP WITH TIME ZONE NOT NULL,
  adult                BOOLEAN
);

--rollback DROP TABLE movie;