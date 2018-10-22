package com.encuesta.app.dao;

import com.encuesta.app.entity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlumnoDao extends JpaRepository<AlumnoEntity, Long> {

}
