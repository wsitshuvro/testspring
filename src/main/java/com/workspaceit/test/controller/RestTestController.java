package com.workspaceit.test.controller;

import com.workspaceit.test.model.RestTestModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class RestTestController {

    @RequestMapping(value ="/rest", method = RequestMethod.GET)
    @ResponseBody
    public List<RestTestModel> generateRests() {

        List<RestTestModel> list = new ArrayList<>();

        RestTestModel p1 = new RestTestModel();
        p1.setId(1);
        p1.setName("rest 1");

        RestTestModel p2 = new RestTestModel();
        p2.setId(2);
        p2.setName("Rest 2");

        list.add(p1);
        list.add(p2);

        return list;
    }
}
