    package com.example.ai.intercom.command;
    import com.example.ai.dto.DogDetailsDTO;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.cloud.openfeign.FeignClient;
    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.http.HttpHeaders;
    import org.springframework.http.ResponseEntity;
    import org.springframework.stereotype.Service;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestHeader;
    import org.springframework.web.bind.annotation.RequestParam;



    @FeignClient(name = "example-service", url = "https://api.api-ninjas.com/v1/dogs")
    public interface CommandClient {
        @GetMapping()
        ResponseEntity<DogDetailsDTO[]> ninjaResponse(@RequestParam String name,
                                                      @RequestHeader HttpHeaders additionalHeaders);
    }






