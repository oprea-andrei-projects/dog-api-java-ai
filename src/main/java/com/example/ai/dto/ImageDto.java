package com.example.ai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageDto {
    @JsonProperty("message")
    String message;
    @JsonProperty("status")
    String status;

    public ImageDto() {
    }

    public ImageDto(String message, String status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
