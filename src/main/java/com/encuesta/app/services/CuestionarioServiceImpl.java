package com.encuesta.app.services;

import com.encuesta.app.dao.CuestionarioDao;
import com.encuesta.app.entity.CuestionarioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CuestionarioServiceImpl implements CuestionarioService {

    @Autowired
    private CuestionarioDao cuestionarioDao;

    @Transactional(readOnly = true)
    @Override
    public List<CuestionarioEntity> findAll() {
        return cuestionarioDao.findAll();
    }
}
