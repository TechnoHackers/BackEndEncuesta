package com.encuesta.app.controller;

import com.encuesta.app.entity.encuestaEntity;
import com.encuesta.app.services.encuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/encuesta")
@RestController
public class encuestaController {


    @Autowired
    private encuestaService encuestaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    private List<encuestaEntity> findAll(){
        return encuestaService.findAllByFac();
    }

}
