package com.prebor.stage1;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Service
public class ServiceClass {

    private static final String CAT_FACT_URL = "https://catfact.ninja/fact";
    private final RestTemplate restTemplate;

    public ServiceClass(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public ResponseDto getPersonalInfo() {
        CatFactResponse response = restTemplate.getForObject(CAT_FACT_URL, CatFactResponse.class);

        User user = new User("prebstamar@gmail.com", "Prebor Tamarakro", "Java, Springboot");
        return new ResponseDto("success", user, OffsetDateTime.now(ZoneOffset.UTC)
                .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME), response.getFact());
    }
}
