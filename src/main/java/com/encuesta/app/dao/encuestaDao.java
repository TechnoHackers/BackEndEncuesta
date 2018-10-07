package com.encuesta.app.dao;

import com.encuesta.app.entity.encuestaEntity;

import java.util.List;

public interface encuestaDao {

    public List<encuestaEntity> findAll();
    public List<encuestaEntity> findAllByFac();
}
