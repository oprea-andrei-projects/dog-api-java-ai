package com.example.ai.dogCeoApi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/dogs")
public class DogCeoController {

    private final DogCeoApiAdapter dogCeoApiAdapter;

    public DogCeoController(DogCeoApiAdapter dogCeoApiAdapter) {
        this.dogCeoApiAdapter = dogCeoApiAdapter;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/breeds", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Map<String, String[]>> getAllDogBreeds() {
        Map<String, String[]> breeds = dogCeoApiAdapter.getAllDogBreeds();
        return ResponseEntity.ok(breeds);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value = "/image/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String>getDogBreedImage(@PathVariable String name){

        String image = dogCeoApiAdapter.getTheDogImage(name);

        return ResponseEntity.ok().body("{\"imageUrl\": \"" + image + "\"}");
    }
}