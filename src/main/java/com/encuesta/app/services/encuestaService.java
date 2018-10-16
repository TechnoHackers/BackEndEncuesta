package com.encuesta.app.services;

import com.encuesta.app.entity.EncuestaEntity;

import java.util.List;

public interface encuestaService {

    public List<EncuestaEntity> findAll();
    public List<EncuestaEntity> findAllByFac();

}
