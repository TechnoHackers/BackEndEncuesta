package com.encuesta.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "detalle_encuesta")
public class DetalleEncuestaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cod_encsta")
    private int CodEncsta;

    @Column(name = "cod_fac")
    private int CodFac;
    
    public int getCodEncsta() {
        return CodEncsta;
    }

    public void setCodEncsta(int codEncsta) {
        CodEncsta = codEncsta;
    }

    public int getCodFac() {
        return CodFac;
    }

    public void setCodFac(int codFac) {
        CodFac = codFac;
    }
}
