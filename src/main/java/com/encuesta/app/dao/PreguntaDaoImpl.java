package com.encuesta.app.dao;

import com.encuesta.app.entity.PreguntaEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PreguntaDaoImpl implements PreguntaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<PreguntaEntity> findAll() {
        return entityManager.createQuery("from PreguntaEntity").getResultList();
    }

    @Override
    public void save(PreguntaEntity preguntaEntity) {

        if(preguntaEntity.getIdPreg()!=null && preguntaEntity.getIdPreg()>0){
            entityManager.merge(preguntaEntity);
        }else{
            entityManager.persist(preguntaEntity);
        }
    }

    @Override
    public PreguntaEntity findOne(Long id) {
        return entityManager.find(PreguntaEntity.class,id);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(findOne(id));
    }

}
