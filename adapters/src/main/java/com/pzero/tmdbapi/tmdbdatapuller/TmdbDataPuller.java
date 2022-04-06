package com.pzero.tmdbapi.tmdbdatapuller;

import com.pzero.tmdbapi.TmdbDataPullerFacade;
import com.pzero.tmdbapi.dto.MovieTmdb;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
class TmdbDataPuller implements TmdbDataPullerFacade {

    @Value("${tmdb.api.get.movie}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public TmdbDataPuller(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    ResponseEntity<String> getResponseFrom(String url) {
        return restTemplate.getForEntity(url, String.class);
    }

    MovieTmdb mapResponseToDto(ResponseEntity<String> response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(response.getBody(), MovieTmdb.class);
    }
}