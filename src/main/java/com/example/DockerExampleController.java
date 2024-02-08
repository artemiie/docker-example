package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class DockerExampleController {

    private final DockerExampleRepository repository;

    public DockerExampleController(DockerExampleRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String test() {
        return Arrays.toString(repository.findAll().toArray());
    }
}
