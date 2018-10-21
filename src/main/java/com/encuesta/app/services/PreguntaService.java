package com.encuesta.app.services;


import com.encuesta.app.entity.PreguntaEntity;

import java.util.List;

public interface PreguntaService {

    public List<PreguntaEntity> findAll();
    public void save (PreguntaEntity preguntaEntity);
    public PreguntaEntity findOne(Long id);
    public void delete(Long id);

}
