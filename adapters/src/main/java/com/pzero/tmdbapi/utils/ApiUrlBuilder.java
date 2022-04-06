package com.pzero.tmdbapi.utils;

import org.apache.commons.lang3.StringUtils;

import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.apache.commons.lang3.ObjectUtils.isNotEmpty;

public class ApiUrlBuilder {

    private static final String TMDB_BASE_URL = "https://api.themoviedb.org/3/";
    private final Map<String, String> params = new HashMap<>();
    private final String baseUrl;

    // https://developers.themoviedb.org/3/getting-started/append-to-response
    private static final String APPEND_TO_RESPONSE = "append_to_response";

    public ApiUrlBuilder(Object... urlElements) {

        StringBuilder baseUrlBuilder = new StringBuilder(TMDB_BASE_URL);
        for (int i = 0; i < urlElements.length; i++) {
            baseUrlBuilder.append(urlElements[i]);
            if (i < urlElements.length - 1) {
                baseUrlBuilder.append("/");
            }
        }
        baseUrl = baseUrlBuilder.toString();
    }

    public URL buildUrl() {
        StringBuilder urlBuilder = new StringBuilder(baseUrl);

        try {
            if (params.size() > 0) {
                List<String> keys = new ArrayList<String>(params.keySet());
                for (int i = 0; i < keys.size(); i++) {
                    urlBuilder.append(i == 0 ? "?" : "&");
                    String paramName = keys.get(i);
                    urlBuilder.append(paramName).append("=");
                    urlBuilder.append(URLEncoder.encode(params.get(paramName), StandardCharsets.UTF_8));
                }
            }
            return new URL(urlBuilder.toString());

        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void addParam(String name, String value) {
        if (params.containsKey(name)) {
            throw new RuntimeException("paramater '" + name + "' already defined");
        }

        if (name.isEmpty()) {
            throw new RuntimeException("parameter name can not be empty");
        }
        if (value.isEmpty()) {
            throw new RuntimeException("value of parameter '" + name + "' can not be empty");
        }
        params.put(name, value);
    }

    public void appendToResponse(String... appendToResponse) {
        if (isNotEmpty(appendToResponse)) {
            addParam(APPEND_TO_RESPONSE, StringUtils.join(appendToResponse, ","));
        }
    }
}