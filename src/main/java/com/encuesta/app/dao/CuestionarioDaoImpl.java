package com.encuesta.app.dao;

import com.encuesta.app.entity.CuestionarioEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CuestionarioDaoImpl implements CuestionarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CuestionarioEntity> findAll() {
        return entityManager.createQuery("from CuestionarioEntity").getResultList();
    }
}
