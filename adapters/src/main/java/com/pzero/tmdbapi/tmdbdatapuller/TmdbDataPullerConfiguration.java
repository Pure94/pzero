package com.pzero.tmdbapi.tmdbdatapuller;

import com.pzero.tmdbapi.TmdbDataPullerFacade;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EntityScan
@Configuration
class TmdbDataPullerConfiguration {

    @Bean
    TmdbDataPullerFacade tmdbDataCloner(RestTemplate restTemplate) {
        return new TmdbDataPuller(restTemplate);
    }
}
