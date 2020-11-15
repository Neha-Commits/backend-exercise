package com.moneysupermarket.interview.controller;

import com.moneysupermarket.interview.service.ProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendExerciseController {

    @Autowired
    ProcessingService processService;



    @GetMapping("/exchange")
    public ResponseEntity<String> getExchangeDetails() {
        processService.getExchangeValues();

        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }
}
