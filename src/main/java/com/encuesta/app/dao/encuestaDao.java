package com.encuesta.app.dao;

import com.encuesta.app.entity.EncuestaEntity;

import java.util.List;

public interface encuestaDao {

    public List<EncuestaEntity> findAll();
    public List<EncuestaEntity> findAllByFac();
}
