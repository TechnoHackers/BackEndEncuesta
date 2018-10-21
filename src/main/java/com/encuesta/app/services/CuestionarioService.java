package com.encuesta.app.services;

import com.encuesta.app.entity.CuestionarioEntity;

import java.util.List;

public interface CuestionarioService {
    public List<CuestionarioEntity> findAll();
}
