package com.example.ai.dogCeoApi;

import com.example.ai.dto.DogListResponseDTO;
import com.example.ai.dto.ImageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "dog-ceo-client", url = "https://dog.ceo/api")
public interface DogCeoApiClient {
    @GetMapping("/breeds/list/all")
    ResponseEntity<DogListResponseDTO> getAllDogBreeds();

    @GetMapping("/breed/{name}/images/random")
    ResponseEntity<ImageDto> getDogImage(@PathVariable String name);
}
