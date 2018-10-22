package com.encuesta.app.controller;

import com.encuesta.app.entity.TestEntity;
import com.encuesta.app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/test")
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<TestEntity>getAllTests(){
        return testService.findAll();
    }

}
