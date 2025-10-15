package com.prebor.stage1;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    private final ServiceClass serviceClass;

    public ControllerClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping("/me")
    public ResponseEntity<ResponseDto> getFacts(){
        return ResponseEntity.ok(serviceClass.getPersonalInfo());
    }
}
