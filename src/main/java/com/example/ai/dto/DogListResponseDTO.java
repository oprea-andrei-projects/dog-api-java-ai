package com.example.ai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class DogListResponseDTO {
    @JsonProperty("message")
    private Map<String, String[]> message;

    public Map<String, String[]> getMessage() {
        return message;
    }

    public void setMessage(Map<String, String[]> message) {
        this.message = message;
    }
}
