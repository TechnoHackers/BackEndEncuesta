package com.encuesta.app.services;


import com.encuesta.app.dao.ReportePmaDao;
import com.encuesta.app.entity.ReportePmaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportePmaServiceImpl implements ReportePmaService {

	@Autowired
	private ReportePmaDao reportePmaDao;

	@Override
	public List<ReportePmaEntity> findAll() {

		List<ReportePmaEntity> reportePmaEntities = (List<ReportePmaEntity>) reportePmaDao.findAll();

		return reportePmaEntities;
	}
}
