package com.daeho.survey.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/survey")
public class SurveyController {

    @GetMapping("")

    public ResponseEntity getSurveyList() {
        System.out.println("HI");
        return new ResponseEntity(HttpStatus.OK);
    }

}


