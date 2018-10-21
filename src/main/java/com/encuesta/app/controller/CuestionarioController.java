package com.encuesta.app.controller;

import com.encuesta.app.entity.CuestionarioEntity;
import com.encuesta.app.services.CuestionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/cuestionario/")
@RestController
public class CuestionarioController {

    @Autowired
    private CuestionarioService cuestionarioService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    private List<CuestionarioEntity> findAll(){
        return cuestionarioService.findAll();
    }


}
