package com.encuesta.app.controller;


import com.encuesta.app.entity.ReportePmaEntity;
import com.encuesta.app.services.ReportePmaService;
import com.encuesta.app.utility.GeneratePdfReportPma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@RestController
public class ReportePmaController {

	@Autowired
	ReportePmaService reportePmaService;

	@RequestMapping(value = "/pdfreport", method = RequestMethod.GET, produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> citiesReport() throws IOException {

		List<ReportePmaEntity> cities = (List<ReportePmaEntity>) reportePmaService.findAll();

		ByteArrayInputStream bis = GeneratePdfReportPma.citiesReport(cities);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.body(new InputStreamResource(bis));
	}
}
