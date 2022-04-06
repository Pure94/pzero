package com.pzero.tmdbapi.controller;

import com.pzero.tmdbapi.TmdbDataPullerFacade;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Secured("ROLE_OPERATOR")
public class TmdbDataManualPullerController {

    static final class Routes {

        static final String ROOT = "/movies/{tmdbID}";
    }

    private final TmdbDataPullerFacade tmdbDataPuller;
    TmdbDataManualPullerController(final TmdbDataPullerFacade tmdbDataPuller) {
        this.tmdbDataPuller = tmdbDataPuller;
    }

}
