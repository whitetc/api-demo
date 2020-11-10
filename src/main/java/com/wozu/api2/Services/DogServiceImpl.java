package com.wozu.api2.Services;

import com.wozu.api2.Models.Dog;
import com.wozu.api2.Repositories.DogService;
import org.springframework.web.client.RestTemplate;

public class DogServiceImpl implements DogService {
    @Override
    public Dog getDogFromDogApi() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject()
    }

    public void postDogFromDogApi(Dog dog) {
    dogRepo.sa
    }
    @PostMapping("/create/dog")
    public String postDog() {
        Dog dog = dogServiceImpl.getDogFromDogAPI
    }
}
