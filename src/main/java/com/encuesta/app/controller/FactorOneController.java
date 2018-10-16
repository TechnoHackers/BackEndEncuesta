package com.encuesta.app.controller;


import com.encuesta.app.entity.FactorOneEntity;
import com.encuesta.app.services.FactorOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/api/factorone")
@RestController
public class FactorOneController {

    @Autowired
    private FactorOneService factorOneService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ArrayList<FactorOneEntity> findAll(){
        return (ArrayList<FactorOneEntity>) factorOneService.FindAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public FactorOneEntity save(@RequestParam Long cod_fac1, @RequestParam String nom_pre, @RequestParam String a1,
                                @RequestParam String a2,@RequestParam String a3,@RequestParam String a4,@RequestParam String comentario,
                                @RequestParam int tiempo, @RequestParam int estado){

        FactorOneEntity factorOneEntity=new FactorOneEntity();
        factorOneEntity.setCodFac1(cod_fac1);
        factorOneEntity.setNomPre(nom_pre);
        factorOneEntity.setAlter1(a1);
        factorOneEntity.setAlter2(a2);
        factorOneEntity.setAlter3(a3);
        factorOneEntity.setAlter4(a4);
        factorOneEntity.setComentario(comentario);
        factorOneEntity.setTiempo(tiempo);
        factorOneEntity.setEstado(estado);

        factorOneService.save(factorOneEntity);

        return factorOneEntity;

    }

}
