package com.encuesta.app.controller;


import com.encuesta.app.entity.AlumnoEntity;
import com.encuesta.app.services.alumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/alumno")
@RestController
public class AlumnoController {

    @Autowired
   private alumnoService alumnoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    private List<AlumnoEntity>findAll(){
        return alumnoService.findAll();
    }

}
