package com.encuesta.app.dao;

import com.encuesta.app.entity.AlumnoEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AlumnoDaoImpl implements AlumnoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<AlumnoEntity> findAll() {

        return entityManager.createQuery("from alumnoEntity").getResultList();

    }
}