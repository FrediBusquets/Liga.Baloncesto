package com.example.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 3/12/15.
 */
@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String nombreclub;
    @Column
    private String localizacion;
    @Column
    private Date fechaCreacion;

    @JsonIgnore
    @ManyToMany
    private Set<Temporada> temporadas = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "equipo") // solo en modo lectura!
    private Set<Jugador> jugadores = new HashSet<>();

    public Equipo(){

    }
    public Equipo(String nombreclub, String localizacion, Date fechaCreacion)
    {
        this.nombreclub = nombreclub;
        this.localizacion = localizacion;
        this.fechaCreacion = fechaCreacion;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombreclub() {
        return nombreclub;
    }

    public void setNombreclub(String nombreclub) {
        this.nombreclub = nombreclub;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "fechaCreacion=" + fechaCreacion +
                ", localizacion='" + localizacion + '\'' +
                ", nombreclub='" + nombreclub + '\'' +
                ", id=" + id +
                '}';
    }


}
