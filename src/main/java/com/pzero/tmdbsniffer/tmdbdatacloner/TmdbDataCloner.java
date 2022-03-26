package com.pzero.tmdbsniffer.tmdbdatacloner;

import com.pzero.tmdbsniffer.TmdbDataClonerFacade;
import com.pzero.tmdbsniffer.dto.Movie;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@Service
class TmdbDataCloner implements TmdbDataClonerFacade {

    private final RestTemplate restTemplate;

    public TmdbDataCloner(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    ResponseEntity<String> getResponseFrom(String url) {
        return restTemplate.getForEntity(url, String.class);
    }

    Movie mapResponseToDto(ResponseEntity<String> response) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.readValue(response.getBody(), Movie.class);
    }

    @PostConstruct
    void initialize() throws JsonProcessingException {
        int id = 550;
        ResponseEntity<String> response = getResponseFrom("https://api.themoviedb.org/3/movie/" + id + "?api_key=");
        mapResponseToDto(response);

    }
}