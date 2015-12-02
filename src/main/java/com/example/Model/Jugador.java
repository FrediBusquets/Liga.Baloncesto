package com.example.Model;
import javax.persistence.*;
import java.util.Date;
/**
 * Created by jhipster on 1/12/15.
 */
@Entity
public class Jugador {
/*Empezaremos con la entidad jugador. La entidad jugador tendrá los siguientes atributos:
 un identificador, un nombre, una fecha de nacimiento, un número de canastas totales,
 un número de asistencias totales, un número de rebotes totales y una posición en el
 campo por defecto (alero, base, etc.).
*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    protected Long id;

    private String nombre;

    private Date dianacimiento;

    private int anotaciones;

    private int asistencias;

    private int rebotes;

    private String posicion;

   /* @JsonIgnore
    @ManyToOne
    private Equipo equipo;
    */
    public Jugador() {
    }

    public Jugador(String nombre, Date dianacimiento, int anotaciones, int asistencias, int rebotes, String posicion) {
        this.nombre = nombre;
        this.dianacimiento = dianacimiento;
        this.anotaciones = anotaciones;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getDianacimiento() {
        return dianacimiento;
    }

    public void setDianacimiento(Date dianacimiento) {
        this.dianacimiento = dianacimiento;
    }

    public int getanotaciones() {
        return anotaciones;
    }

    public void setAnotaciones(int anotaciones) {
        this.anotaciones = anotaciones;
    }
    public int getasistenias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public int getrebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }
    public String getposicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    /*
    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.Equipo = Equipo;
    }
    */
    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anotaciones='" + anotaciones + '\'' +
                ", asistencias='" + asistencias + '\'' +
                ", rebotes='" + rebotes + '\''+
                ", posicion='" + posicion + '\''+
                ", dianacimiento='" + dianacimiento + '\''+
                '}';
    }
}
/*
        this.nombre = nombre;
        this.id = id;
        this.anotaciones = anotaciones;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.posicion = posicion;
        */
