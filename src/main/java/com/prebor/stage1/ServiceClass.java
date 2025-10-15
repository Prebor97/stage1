package com.prebor.stage1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Service
public class ServiceClass {
    private static final Logger log = LoggerFactory.getLogger(ServiceClass.class);
    private static final String CAT_FACT_URL = "https://catfact.ninja/fact";
    private final RestTemplate restTemplate;

    public ServiceClass(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public ResponseDto getPersonalInfo() {
        log.info("Getting Json for cat api..................................................................");
        CatFactResponse response = restTemplate.getForObject(CAT_FACT_URL, CatFactResponse.class);
        log.info("Processing user info...............................................................");
        User user = new User("prebstamar@gmail.com", "Prebor Tamarakro", "Java, Springboot");
        log.info("Returning response...........................................................");
        return new ResponseDto("success", user, OffsetDateTime.now(ZoneOffset.UTC)
                .format(DateTimeFormatter.ISO_OFFSET_DATE_TIME), response.getFact());
    }
}
