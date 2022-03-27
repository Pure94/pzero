package com.pzero.tmdbsniffer.tmdbdatapuller;

import com.pzero.tmdbsniffer.TmdbDataClonerFacade;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@EntityScan
@Configuration
class TmdbDataPullerConfiguration {

    @Bean
    TmdbDataClonerFacade tmdbDataCloner(RestTemplate restTemplate) {
        return new TmdbDataPuller(restTemplate);
    }
}
