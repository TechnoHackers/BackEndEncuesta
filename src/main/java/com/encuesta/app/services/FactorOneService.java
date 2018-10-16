package com.encuesta.app.services;

import com.encuesta.app.entity.FactorOneEntity;

import java.util.List;

public interface FactorOneService {

    public List<FactorOneEntity> FindAll();
    public void save (FactorOneEntity factorOneEntity);
    public FactorOneEntity findOne(Long id);
    public void delete(Long id);

}
