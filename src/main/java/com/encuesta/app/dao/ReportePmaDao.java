package com.encuesta.app.dao;

import com.encuesta.app.entity.ReportePmaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportePmaDao extends CrudRepository<ReportePmaEntity, Long> {

}