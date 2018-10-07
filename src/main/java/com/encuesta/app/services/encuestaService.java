package com.encuesta.app.services;

import com.encuesta.app.entity.encuestaEntity;

import java.util.List;

public interface encuestaService {

    public List<encuestaEntity> findAll();
    public List<encuestaEntity> findAllByFac();

}
