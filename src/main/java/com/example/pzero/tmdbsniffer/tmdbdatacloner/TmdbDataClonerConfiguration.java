package com.example.pzero.tmdbsniffer.tmdbdatacloner;

import com.example.pzero.tmdbsniffer.TmdbDataClonerFacade;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EntityScan
@Configuration
class TmdbDataClonerConfiguration {

    @Bean
    TmdbDataClonerFacade tmdbDataCloner(RestTemplate restTemplate) {
        return new TmdbDataCloner(restTemplate);
    }
}
