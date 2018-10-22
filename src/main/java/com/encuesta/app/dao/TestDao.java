package com.encuesta.app.dao;

import com.encuesta.app.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TestDao extends JpaRepository<TestEntity, Long> {
}
