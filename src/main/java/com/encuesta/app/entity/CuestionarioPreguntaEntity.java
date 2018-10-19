package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "cuestionarios_preguntas")
public class CuestionarioPreguntaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cp")
    private Long idCP;

    @Column(name = "id_pre")
    private Long idPre;

    @Column(name = "id_alu")
    private Long idAlu;

    @Column(name = "respsel")
    private String respSel;

    public CuestionarioPreguntaEntity() {
    }

    public Long getIdCP() {
        return idCP;
    }

    public void setIdCP(Long idCP) {
        this.idCP = idCP;
    }

    public Long getIdPre() {
        return idPre;
    }

    public void setIdPre(Long idPre) {
        this.idPre = idPre;
    }

    public Long getIdAlu() {
        return idAlu;
    }

    public void setIdAlu(Long idAlu) {
        this.idAlu = idAlu;
    }

    public String getRespSel() {
        return respSel;
    }

    public void setRespSel(String respSel) {
        this.respSel = respSel;
    }
}
