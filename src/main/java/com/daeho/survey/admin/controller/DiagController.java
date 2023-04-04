package com.daeho.survey.admin.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/diag")
@Slf4j
public class DiagController {

    @PostMapping("")
    @ApiOperation(value = "진단자 등록")
    public ResponseEntity add() {
        log.info("## api/v1/diag : add()");
        ResponseEntity result =  new ResponseEntity(HttpStatus.OK);
        return result;
    }

}
