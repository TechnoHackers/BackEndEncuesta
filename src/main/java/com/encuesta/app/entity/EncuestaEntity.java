package com.encuesta.app.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "encuestas")
public class EncuestaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int idEncuesta;

    @Column(name = "cod_alum")
    private int CodAlum;

    @Column(name = "nom_encsta")
    private String NomEncsta;

    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date createAt;


    public EncuestaEntity() {
    }


    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public int getCodAlum() {
        return CodAlum;
    }

    public void setCodAlum(int codAlum) {
        CodAlum = codAlum;
    }

    public String getNomEncsta() {
        return NomEncsta;
    }

    public void setNomEncsta(String nomEncsta) {
        NomEncsta = nomEncsta;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
