package com.encuesta.app.services;

import com.encuesta.app.dao.FactorOneDao;
import com.encuesta.app.entity.FactorOneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FactorOneServiceImpl implements FactorOneService {

    @Autowired
    private FactorOneDao factorOneDao;

    @Transactional(readOnly = true)
    @Override
    public List<FactorOneEntity> FindAll() {
        return factorOneDao.FindAll();
    }

    @Transactional
    @Override
    public void save(FactorOneEntity factorOneEntity) {
        factorOneDao.save(factorOneEntity);
    }

    @Transactional(readOnly = true)
    @Override
    public FactorOneEntity findOne(Long id) {
        return factorOneDao.findOne(id);
    }

    @Transactional
    @Override
    public void delete(Long id) {
       factorOneDao.delete(id);
    }
}
