package com.example.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 3/12/15.
 */
@Entity
public class Liga {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column

    private Long idliga;
    @Column
    private String nombreliga;

    @OneToMany(mappedBy = "liga") // solo en modo lectura!
    private Set<Temporada> temporadas = new HashSet<>();

    public Liga(){

    }

    public Liga(String nombre) {
        this.nombreliga = nombreliga;
    }

    public Long getIdliga() {
        return idliga;
    }

    public void setIdliga(Long idliga) {
        this.idliga = idliga;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public String getNombreliga() {
        return nombreliga;
    }

    public void setNombreliga(String nombreliga) {
        this.nombreliga = nombreliga;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "idliga=" + idliga +
                ", nombreliga='" + nombreliga + '\'' +
                '}';
    }
}
