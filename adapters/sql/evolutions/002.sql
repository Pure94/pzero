--liquibase formatted sql
CREATE TABLE genres
(
  id                   BIGINT                  PRIMARY KEY,
  tmdb_genre_id        VARCHAR(255)            NOT NULL,
  name                 VARCHAR(255)
);
--rollback DROP TABLE genres;