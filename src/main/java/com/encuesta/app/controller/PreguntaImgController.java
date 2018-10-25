package com.encuesta.app.controller;

import com.encuesta.app.entity.PreguntaEntity;
import com.encuesta.app.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RequestMapping("/api/preguntaimg")
@RestController
public class PreguntaImgController {


    @Autowired
    private PreguntaService preguntaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public PreguntaEntity postSavePreImg(@RequestParam Long idCues, @RequestParam MultipartFile pregunta, @RequestParam MultipartFile a1,
                               @RequestParam MultipartFile a2, @RequestParam MultipartFile a3, @RequestParam MultipartFile a4, @RequestParam MultipartFile a5, @RequestParam MultipartFile a6){

        PreguntaEntity preguntaEntity =new PreguntaEntity();
        preguntaEntity.setIdCues(idCues);
        if(!pregunta.isEmpty() && !a1.isEmpty() && !a2.isEmpty() && !a3.isEmpty() && !a4.isEmpty() && !a5.isEmpty() && !a6.isEmpty()){

            String rootPath="c://temp/uploads";
            try {

                byte[] bytes_pre=pregunta.getBytes();
                byte[] bytes_a1=a1.getBytes();
                byte[] bytes_a2=a2.getBytes();
                byte[] bytes_a3=a3.getBytes();
                byte[] bytes_a4=a4.getBytes();
                byte[] bytes_a5=a5.getBytes();
                byte[] bytes_a6=a6.getBytes();


                Path rc_pre=Paths.get(rootPath + "//" + pregunta.getOriginalFilename());
                Path rc_a1=Paths.get(rootPath + "//" + a1.getOriginalFilename());
                Path rc_a2=Paths.get(rootPath + "//" + a2.getOriginalFilename());
                Path rc_a3=Paths.get(rootPath + "//" + a3.getOriginalFilename());
                Path rc_a4=Paths.get(rootPath + "//" + a4.getOriginalFilename());
                Path rc_a5=Paths.get(rootPath + "//" + a5.getOriginalFilename());
                Path rc_a6=Paths.get(rootPath + "//" + a6.getOriginalFilename());

                Files.write(rc_pre,bytes_pre);
                Files.write(rc_a1,bytes_a1);
                Files.write(rc_a2,bytes_a2);
                Files.write(rc_a3,bytes_a3);
                Files.write(rc_a4,bytes_a4);
                Files.write(rc_a5,bytes_a5);
                Files.write(rc_a6,bytes_a6);

                preguntaEntity.setNomPre(rootPath+"/"+pregunta.getOriginalFilename());
                preguntaEntity.setA1(rootPath+"/"+a1.getOriginalFilename());
                preguntaEntity.setA2(rootPath+"/"+a2.getOriginalFilename());
                preguntaEntity.setA3(rootPath+"/"+a3.getOriginalFilename());
                preguntaEntity.setA4(rootPath+"/"+a4.getOriginalFilename());
                preguntaEntity.setA5(rootPath+"/"+a5.getOriginalFilename());
                preguntaEntity.setA6(rootPath+"/"+a6.getOriginalFilename());

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        preguntaService.save(preguntaEntity);

        return preguntaEntity;

    }

}
