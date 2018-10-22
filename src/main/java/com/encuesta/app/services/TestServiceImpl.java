package com.encuesta.app.services;

import com.encuesta.app.dao.TestDao;
import com.encuesta.app.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public List<TestEntity> findAll() {
        return testDao.findAll();
    }
}
