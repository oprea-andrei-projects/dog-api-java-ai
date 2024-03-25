package com.example.ai.intercom.command;
import com.example.ai.dto.DogDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class CommandController {

//    @Autowired
    private CommandAdapter commandAdapter;


    public CommandController(CommandAdapter commandAdapter) {
        this.commandAdapter = commandAdapter;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/details")
    public ResponseEntity<DogDetailsDTO[]> getDogDetails(@RequestParam String breedName) {
        DogDetailsDTO[] dogDetails = commandAdapter.callNinjaResponse(breedName);
        if (dogDetails != null) {
            return ResponseEntity.ok().body(dogDetails);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
        }
    }

}
