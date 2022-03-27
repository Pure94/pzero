package com.pzero.tmdbsniffer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieTmdbController {

    private final RestTemplate restTemplate;

    static final class Routes {
        static final String ROOT = "api/v1/movie/{movieId}";
    }

    public MovieTmdbController(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    @GetMapping(Routes.ROOT)
//    public ResponseEntity<String> getMovie(@PathVariable final Integer movieId, final String apiKey) {
//
//
//    }
}
