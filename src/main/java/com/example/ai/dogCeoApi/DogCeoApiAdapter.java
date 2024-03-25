package com.example.ai.dogCeoApi;

import com.example.ai.dto.DogListResponseDTO;
import com.example.ai.dto.ImageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DogCeoApiAdapter {

    private final DogCeoApiClient dogCeoApiClient;

    public DogCeoApiAdapter(DogCeoApiClient dogCeoApiClient) {
        this.dogCeoApiClient = dogCeoApiClient;
    }

    public Map<String, String[]> getAllDogBreeds() {
        ResponseEntity<DogListResponseDTO> responseEntity = dogCeoApiClient.getAllDogBreeds();
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody().getMessage();
        } else {
            throw new RuntimeException("Failed to fetch dog breeds");
        }
    }

    public String getTheDogImage(String name){

        ResponseEntity<ImageDto> responseEntity = dogCeoApiClient.getDogImage(name);
        if(responseEntity.getStatusCode().is2xxSuccessful()){
            return responseEntity.getBody().getMessage();
        }else{
            throw new RuntimeException("Failed to fetch dog image");
        }
    }
}
