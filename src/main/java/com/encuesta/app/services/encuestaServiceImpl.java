package com.encuesta.app.services;

import com.encuesta.app.dao.encuestaDao;
import com.encuesta.app.entity.encuestaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class encuestaServiceImpl implements encuestaService {

    @Autowired
    private encuestaDao encuestaDao;

    @Override
    public List<encuestaEntity> findAll() {
        return encuestaDao.findAll();
    }

    @Override
    public List<encuestaEntity> findAllByFac() {
        return encuestaDao.findAllByFac();
    }
}
