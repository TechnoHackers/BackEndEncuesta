package com.encuesta.app.dao;

import com.encuesta.app.entity.FactorOneEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class FactorOneDaoImpl implements FactorOneDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<FactorOneEntity> FindAll() {
        return entityManager.createQuery("from FactorOneEntity").getResultList();
    }

    @Override
    public void save(FactorOneEntity factorOneEntity) {
        if( factorOneEntity.getIdF1()!=null &&  factorOneEntity.getIdF1()>0){
            entityManager.merge(factorOneEntity);
        }else{
            entityManager.persist(factorOneEntity);
        }
    }

    @Override
    public FactorOneEntity findOne(Long id) {
        return entityManager.find(FactorOneEntity.class,id);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(findOne(id));
    }
}
