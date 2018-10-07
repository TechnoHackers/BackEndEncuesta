package com.encuesta.app.dao;

import com.encuesta.app.entity.alumnoEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class alumnoDaoImpl implements alumnoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<alumnoEntity> findAll() {

        return entityManager.createQuery("from alumnoEntity").getResultList();

    }
}
