package com.encuesta.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cuestionarios")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CuestionarioEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuest")
    private Long idCuest;

    @Column(name = "tiempo")
    private int tiempo;

    @Column(name = "esfactor")
    private String esFactor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_test",nullable = false)
    @JsonIgnore
    private TestEntity test;

    public CuestionarioEntity() { }

    public CuestionarioEntity(int tiempo, String esFactor) {
        this.tiempo = tiempo;
        this.esFactor = esFactor;
    }

    public Long getIdCuest() {
        return idCuest;
    }

    public void setIdCuest(Long idCuest) {
        this.idCuest = idCuest;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getEsFactor() {
        return esFactor;
    }

    public void setEsFactor(String esFactor) {
        this.esFactor = esFactor;
    }

    public TestEntity getTest() {
        return test;
    }

    public void setTest(TestEntity test) {
        this.test = test;
    }
}
