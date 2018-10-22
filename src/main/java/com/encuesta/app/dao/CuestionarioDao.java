package com.encuesta.app.dao;

import com.encuesta.app.entity.CuestionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CuestionarioDao extends JpaRepository<CuestionarioEntity,Long> {
}
