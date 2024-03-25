package com.example.ai.testController;

import com.example.ai.test.ChatRequest;
import com.example.ai.test.ChatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RestController
public class ChatController {

    @Qualifier("openaiRestTemplate")
    @Autowired
    private RestTemplate restTemplate;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiUrl;

//    @CrossOrigin(origins = "http://localhost:4200")
//    @GetMapping("/chat")
//    public String chat(@RequestParam String prompt){
//
//        ChatRequest request = new ChatRequest(model, prompt,1);
//        ResponseEntity<String> responseEntity = restTemplate.postForEntity(apiUrl, request, String.class);
//
//
//        String responseBody = responseEntity.getBody();
//        System.out.println("Response from OpenAI API: " + responseBody);
//
//
//        ChatResponse response = restTemplate.postForObject(apiUrl, request, ChatResponse.class);
//
//        if(response == null || response.getChoices() == null || response.getChoices().length==0){
//            return "No response from OpenAI";
//        }
//
//        return response.getChoices()[0].getMessage().getContent();
//
//    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam String prompt) {
        ChatRequest request = new ChatRequest(model, prompt, 1);


        ResponseEntity<String> responseEntity = restTemplate.postForEntity(apiUrl, request, String.class);


        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            String responseBody = responseEntity.getBody();
            System.out.println("Response from OpenAI API: " + responseBody);
            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(responseBody);
        } else {

            return ResponseEntity.status(responseEntity.getStatusCode())
                    .contentType(MediaType.APPLICATION_JSON)
                    .body("{\"error\": \"Failed to get response from OpenAI\"}");
        }
    }
}
