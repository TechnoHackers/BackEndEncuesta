package com.encuesta.app.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tests")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TestEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_test")
    private Long idTest;

    @Column(name = "nom_test")
    private String nomTest;

    @OneToMany(mappedBy = "test", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CuestionarioEntity> cuestionario;

    public TestEntity() { }

    public TestEntity(String nomTest) {
        this.nomTest = nomTest;
    }

    public Long getIdTest() {
        return idTest;
    }

    public void setIdTest(Long idTest) {
        this.idTest = idTest;
    }

    public String getNomTest() {
        return nomTest;
    }

    public void setNomTest(String nomTest) {
        this.nomTest = nomTest;
    }

    public Set<CuestionarioEntity> getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(Set<CuestionarioEntity> cuestionario) {
        this.cuestionario = cuestionario;
    }
}
