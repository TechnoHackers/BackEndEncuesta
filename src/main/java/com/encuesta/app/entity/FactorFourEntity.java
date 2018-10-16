package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "factor4")
public class FactorFourEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_f4")
    private Long IdF4;

    @Column(name = "cod_fac4")
    private Long CodFac4;

    @Column(name = "nom_pre")
    private String NomPre;

    @Column(name = "a1")
    private String Alter1;

    @Column(name = "a2")
    private String Alter2;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "tiempo")
    private int tiempo;

    @Column(name = "estado")
    private int estado;


    public FactorFourEntity() {
    }

    public Long getIdF4() {
        return IdF4;
    }

    public void setIdF4(Long idF4) {
        IdF4 = idF4;
    }

    public Long getCodFac4() {
        return CodFac4;
    }

    public void setCodFac4(Long codFac4) {
        CodFac4 = codFac4;
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
