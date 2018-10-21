package com.encuesta.app.dao;

import com.encuesta.app.entity.CuestionarioEntity;

import java.util.List;

public interface CuestionarioDao {
    public List<CuestionarioEntity> findAll();
}
