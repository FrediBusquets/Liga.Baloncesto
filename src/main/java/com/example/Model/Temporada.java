package com.example.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 3/12/15.
 */
@Entity
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column

    private Long idTemporada;
    @Column
    private Date year;
    @ManyToOne //una liga tiene varias temporadas
    private Liga liga;

    @ManyToMany (mappedBy = "temporadas")
    private Set<Equipo> equipos = new HashSet<>();

    public Temporada(){ }

    public Temporada(Date year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "idTemporada=" + idTemporada +
                ", year=" + year +
                ", liga=" + liga +
                ", equipos=" + equipos +
                '}';
    }

    public Long getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(Long idTemporada) {
        this.idTemporada = idTemporada;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }
}
