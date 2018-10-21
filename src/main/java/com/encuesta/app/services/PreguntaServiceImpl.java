package com.encuesta.app.services;

import com.encuesta.app.dao.PreguntaDao;
import com.encuesta.app.entity.PreguntaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PreguntaServiceImpl implements PreguntaService{

    @Autowired
    private PreguntaDao preguntaDao;

    @Transactional(readOnly = true)
    @Override
    public List<PreguntaEntity> findAll() {
        return preguntaDao.findAll();
    }

    @Transactional
    @Override
    public void save(PreguntaEntity preguntaEntity) {
        preguntaDao.save(preguntaEntity);
    }

    @Transactional(readOnly = true)
    @Override
    public PreguntaEntity findOne(Long id) {
        return preguntaDao.findOne(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        preguntaDao.delete(id);
    }

}
