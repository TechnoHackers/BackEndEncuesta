package com.encuesta.app.entity;


import javax.persistence.*;

@Entity
@Table(name = "factor1")
public class FactorOneEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_f1")
    private Long IdF1;

    @Column(name = "cod_fac1")
    private Long CodFac1;

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

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "tiempo")
    private int tiempo;

    @Column(name = "estado")
    private int estado;


    public FactorOneEntity() {
    }

    public Long getIdF1() {
        return IdF1;
    }

    public void setIdF1(Long idF1) {
        IdF1 = idF1;
    }

    public Long getCodFac1() {
        return CodFac1;
    }

    public void setCodFac1(Long codFac1) {
        CodFac1 = codFac1;
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
