package com.workspaceit.test.controller;

import com.workspaceit.test.model.RestTestModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotYourRestController {

    @RequestMapping(value = "/rest1", method = RequestMethod.GET)
    public RestTestModel get(){
        RestTestModel restTestModel = new RestTestModel();
        restTestModel.setName("dddd");
        restTestModel.setId(1);
        return restTestModel;
    }
    @RequestMapping(value = "/restEntity",method = RequestMethod.GET)
    public ResponseEntity<?> getbyEntity(){
        RestTestModel restTestModel = new RestTestModel();
        restTestModel.setName("dddd");
        restTestModel.setId(1);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(restTestModel);
    }
}
