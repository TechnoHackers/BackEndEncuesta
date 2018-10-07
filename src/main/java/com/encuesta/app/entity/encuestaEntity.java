package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "encuestas")
public class encuestaEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_encuesta")
    private int idEncuesta;

    @Column(name = "id_pma", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPma;

    @Column(name = "nom_encuesta")
    private String nomEncuesta;

    @Column
    private String pregunta;

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

    @Column
    private String factor;

    @Column
    private String comentario;

    @Column(name = "id_alumno")
    private int idAlumno;


    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public int getIdPma() {
        return idPma;
    }

    public void setIdPma(int idPma) {
        this.idPma = idPma;
    }

    public String getNomEncuesta() {
        return nomEncuesta;
    }

    public void setNomEncuesta(String nomEncuesta) {
        this.nomEncuesta = nomEncuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
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

    public String getFactor() {
        return factor;
    }

    public void setFactor(String fator) {
        this.factor = fator;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
}
