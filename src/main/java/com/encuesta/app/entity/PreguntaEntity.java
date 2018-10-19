package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "preguntas")
public class PreguntaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_preg")
    private Long idPreg;

    @Column(name = "id_cues")
    private Long idCues;

    @Column(name = "nom_pre")
    private String nomPre;

    @Column
    private String a1;

    @Column
    private String a2;

    @Column
    private String a3;

    @Column
    private String a4;

    @Column
    private String a5;

    @Column
    private String a6;

    public PreguntaEntity() {
    }

    public Long getIdPreg() {
        return idPreg;
    }

    public void setIdPreg(Long idPreg) {
        this.idPreg = idPreg;
    }

    public Long getIdCues() {
        return idCues;
    }

    public void setIdCues(Long idCues) {
        this.idCues = idCues;
    }

    public String getNomPre() {
        return nomPre;
    }

    public void setNomPre(String nomPre) {
        this.nomPre = nomPre;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }
}
