package com.encuesta.app.entity;


import javax.persistence.*;

@Entity
@Table(name = "factor3")
public class FactorThreeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_f3")
    private Long IdF3;

    @Column(name = "cod_fac3")
    private Long CodFac3;

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


    public FactorThreeEntity() {
    }

    public Long getIdF3() {
        return IdF3;
    }

    public void setIdF3(Long idF3) {
        IdF3 = idF3;
    }

    public Long getCodFac3() {
        return CodFac3;
    }

    public void setCodFac3(Long codFac3) {
        CodFac3 = codFac3;
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
