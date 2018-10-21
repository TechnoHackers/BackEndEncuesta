package com.encuesta.app.controller;

import com.encuesta.app.entity.PreguntaEntity;
import com.encuesta.app.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/pregunta/")
@RestController
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    private List<PreguntaEntity> findAll(){
        return preguntaService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public PreguntaEntity save(@RequestBody PreguntaEntity preguntaEntity){

          preguntaService.save(preguntaEntity);
          return preguntaEntity;
    }


    @GetMapping(value = "{id}")
    public PreguntaEntity editar(@PathVariable(value = "id") Long id){

        PreguntaEntity preguntaEntity=null;

        if(id>0){
            preguntaEntity=preguntaService.findOne(id);
        }

        return preguntaEntity;

    }


    @DeleteMapping(value = "{id}")
    public PreguntaEntity delete(@PathVariable(value = "id") Long id){

        PreguntaEntity preguntaEntity=null;
        if(id>0){
            preguntaService.delete(id);
        }
        return preguntaEntity;
    }


}
