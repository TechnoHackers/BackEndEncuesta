package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "factor5")
public class FactorFiveEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_f5")
    private Long IdF5;

    @Column(name = "cod_fac5")
    private Long CodFac5;

    @Column(name = "nom_pre")
    private String NomPre;

    @Column(name = "respuesta")
    private String Resp;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "tiempo")
    private int tiempo;

    @Column(name = "estado")
    private int estado;


    public FactorFiveEntity() {
    }

    public Long getIdF5() {
        return IdF5;
    }

    public void setIdF5(Long idF5) {
        IdF5 = idF5;
    }

    public Long getCodFac5() {
        return CodFac5;
    }

    public void setCodFac5(Long codFac5) {
        CodFac5 = codFac5;
    }

    public String getNomPre() {
        return NomPre;
    }

    public void setNomPre(String nomPre) {
        NomPre = nomPre;
    }

    public String getResp() {
        return Resp;
    }

    public void setResp(String resp) {
        Resp = resp;
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
