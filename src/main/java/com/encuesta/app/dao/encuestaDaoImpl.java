package com.encuesta.app.dao;

import com.encuesta.app.entity.encuestaEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;


@Repository
public class encuestaDaoImpl implements encuestaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<encuestaEntity> findAll() {
       return entityManager.createQuery("from encuestaEntity").getResultList();
    }

    @Override
    public List<encuestaEntity> findAllByFac() {

        List fac1,fac2,fac3,fac4,fac5,listM;

        fac1=entityManager.createQuery("from encuestaEntity where factor=1").getResultList();
        fac2=entityManager.createQuery("from encuestaEntity where factor=2").getResultList();
        fac3=entityManager.createQuery("from encuestaEntity where factor=3").getResultList();
        fac4=entityManager.createQuery("from encuestaEntity where factor=4").getResultList();
        fac5=entityManager.createQuery("from encuestaEntity where factor=5").getResultList();

        listM=new ArrayList();

        listM.add(0,fac1);
        listM.add(1,fac2);
        listM.add(2,fac3);
        listM.add(3,fac4);
        listM.add(4,fac5);

        return listM;
    }


}
