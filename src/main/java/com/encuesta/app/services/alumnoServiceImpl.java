package com.encuesta.app.services;

import com.encuesta.app.dao.alumnoDao;
import com.encuesta.app.entity.AlumnoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class alumnoServiceImpl implements alumnoService {

    @Autowired
    private alumnoDao alumnoDao;

    @Override
    public List<AlumnoEntity> findAll() {

        return alumnoDao.findAll();
    }
}
