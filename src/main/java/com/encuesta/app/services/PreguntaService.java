package com.encuesta.app.services;


import com.encuesta.app.entity.PreguntaEntity;

import java.util.List;
import java.util.Optional;

public interface PreguntaService {

    public List<PreguntaEntity> findAll();
    public void save (PreguntaEntity preguntaEntity);
    public Optional<PreguntaEntity> findOne(Long id);
    public void delete(Long id);

}
