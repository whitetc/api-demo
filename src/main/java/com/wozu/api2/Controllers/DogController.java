package com.wozu.api2.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DogController {
    @GetMapping("/dog")
    public Dog getDog() {

    }
}
