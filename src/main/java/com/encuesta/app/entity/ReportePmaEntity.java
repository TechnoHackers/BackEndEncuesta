package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "reporte_pma")
public class ReportePmaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nompdf;

	@Column(nullable = true)
	private String bajo;

	@Column(nullable = true)
	private String ten_bajo;

	@Column(nullable = true)
	private String promedio;

	@Column(nullable = true)
	private String ten_alto;

	@Column(nullable = true)
	private String alto;

	public ReportePmaEntity() {
	}

	public ReportePmaEntity(Long id, String nompdf, String bajo, String ten_bjo, String promedio, String ten_alto, String alto) {

		this.id=id;
		this.nompdf = nompdf;
		this.bajo = bajo;
		this.ten_bajo = ten_bjo;
		this.promedio = promedio;
		this.ten_alto = ten_alto;
		this.alto = alto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNompdf() {
		return nompdf;
	}

	public void setNompdf(String nompdf) {
		this.nompdf = nompdf;
	}

	public String getBajo() {
		return bajo;
	}

	public void setBajo(String bajo) {
		this.bajo = bajo;
	}

	public String getTen_bjo() {
		return ten_bajo;
	}

	public void setTen_bjo(String ten_bjo) {
		this.ten_bajo = ten_bjo;
	}

	public String getPromedio() {
		return promedio;
	}

	public void setPromedio(String promedio) {
		this.promedio = promedio;
	}

	public String getTen_alto() {
		return ten_alto;
	}

	public void setTen_alto(String ten_alto) {
		this.ten_alto = ten_alto;
	}

	public String getAlto() {
		return alto;
	}

	public void setAlto(String alto) {
		this.alto = alto;
	}


}
