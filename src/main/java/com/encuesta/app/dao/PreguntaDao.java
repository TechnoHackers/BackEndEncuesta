package com.encuesta.app.dao;


import com.encuesta.app.entity.PreguntaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaDao extends JpaRepository<PreguntaEntity, Long> {
}
