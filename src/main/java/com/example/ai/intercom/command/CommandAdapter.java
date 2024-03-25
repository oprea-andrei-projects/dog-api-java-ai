package com.example.ai.intercom.command;


import com.example.ai.dto.DogDetailsDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CommandAdapter {
    private CommandClient commandClient;

    public CommandAdapter(CommandClient commandClient) {
        this.commandClient = commandClient;
    }

    @Value("${ninja.api.key}")
    private String ninjaApiKey;


    public DogDetailsDTO[] callNinjaResponse(String breedName) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Api-Key", ninjaApiKey);
        ResponseEntity<DogDetailsDTO[]> responseEntity = commandClient.ninjaResponse(breedName,headers);


        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            DogDetailsDTO[] dogDetails = responseEntity.getBody();
            System.out.println(dogDetails);
                return dogDetails;

        } else {

            System.err.println("Error occurred: " + responseEntity.getStatusCode());
            return null;
        }


    }

}
