package com.encuesta.app.dao;

import com.encuesta.app.entity.PreguntaEntity;

import java.util.List;

public interface PreguntaDao {

    public List<PreguntaEntity> findAll();
    public void save (PreguntaEntity preguntaEntity);
    public PreguntaEntity findOne(Long id);
    public void delete(Long id);

}
