package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "factor2")
public class FactorTwoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_f2")
    private Long IdF2;

    @Column(name = "cod_fac2")
    private Long CodFac2;

    @Column(name = "nom_pre")
    private String NomPre;

    @Column(name = "a1")
    private String Alter1;

    @Column(name = "a2")
    private String Alter2;

    @Column(name = "a3")
    private String Alter3;

    @Column(name = "a4")
    private String Alter4;

    @Column(name = "a5")
    private String Alter5;

    @Column(name = "a6")
    private String Alter6;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "tiempo")
    private int tiempo;

    @Column(name = "estado")
    private int estado;


    public FactorTwoEntity() {
    }

    public Long getIdF2() {
        return IdF2;
    }

    public void setIdF2(Long idF2) {
        IdF2 = idF2;
    }

    public Long getCodFac2() {
        return CodFac2;
    }

    public void setCodFac2(Long codFac2) {
        CodFac2 = codFac2;
    }

    public String getNomPre() {
        return NomPre;
    }

    public void setNomPre(String nomPre) {
        NomPre = nomPre;
    }

    public String getAlter1() {
        return Alter1;
    }

    public void setAlter1(String alter1) {
        Alter1 = alter1;
    }

    public String getAlter2() {
        return Alter2;
    }

    public void setAlter2(String alter2) {
        Alter2 = alter2;
    }

    public String getAlter3() {
        return Alter3;
    }

    public void setAlter3(String alter3) {
        Alter3 = alter3;
    }

    public String getAlter4() {
        return Alter4;
    }

    public void setAlter4(String alter4) {
        Alter4 = alter4;
    }

    public String getAlter5() {
        return Alter5;
    }

    public void setAlter5(String alter5) {
        Alter5 = alter5;
    }

    public String getAlter6() {
        return Alter6;
    }

    public void setAlter6(String alter6) {
        Alter6 = alter6;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
