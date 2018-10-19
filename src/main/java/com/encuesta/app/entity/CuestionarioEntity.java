package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "cuestionarios")
public class CuestionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuest")
    private Long idCuest;

    @Column(name = "id_test")
    private Long idTest;

    @Column(name = "tiempo")
    private int tiempo;

    @Column(name = "esfactor")
    private String esFactor;


    public CuestionarioEntity() {
    }


    public Long getIdCuest() {
        return idCuest;
    }

    public void setIdCuest(Long idCuest) {
        this.idCuest = idCuest;
    }

    public Long getIdTest() {
        return idTest;
    }

    public void setIdTest(Long idTest) {
        this.idTest = idTest;
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
}
