package com.wozu.api2.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class MovieServiceImpl MovieService{
    @Value()

    @Override
    public Movie getMovieFromMovieApi(String search){
        String url = "" + api_key + "&t=" + "&plot=full";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url,Movie.class);
    }
}
