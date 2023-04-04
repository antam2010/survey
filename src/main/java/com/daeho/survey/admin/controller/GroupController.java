package com.daeho.survey.admin.controller;

import com.daeho.survey.admin.dto.GroupDTO;
import com.daeho.survey.admin.service.GroupService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/v1/group")
@Slf4j
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping("")
    @ApiOperation(value = "그룹 등록")
    public ResponseEntity add(@ModelAttribute GroupDTO dto) {
        log.info("## api/v1/group : add()");
        log.info("## data = " + dto);
        ResponseEntity result =  new ResponseEntity(groupService.addGroup(), HttpStatus.OK);
        return result;
    }
}
