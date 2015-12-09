package com.example.Service;

import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 3/12/15.
 */
@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;


    public void crearEquipos() {
        Calendar calendar = GregorianCalendar.getInstance();

        //CREACIÓN DE LOS 5 EQUIPOS
        calendar.set(1984, Calendar.SEPTEMBER, 15);
        Equipo equipoA = new Equipo("EquipoA" ,"Madrid" ,calendar.getTime());
        equipoRepository.save(equipoA);

        calendar.set(1990, Calendar.JANUARY, 23);
        Equipo equipoB = new Equipo("EquipoB", "Valencia", calendar.getTime());
        equipoRepository.save(equipoB);

        calendar.set(1978, Calendar.JULY, 9);
        Equipo equipoC = new Equipo("EquipoC", "Barcelona", calendar.getTime());
        equipoRepository.save(equipoC);

        calendar.set(1985, Calendar.AUGUST, 5);
        Equipo equipoD = new Equipo("EquipoD", "Pais Vasco", calendar.getTime());
        equipoRepository.save(equipoD);

        calendar.set(1997, Calendar.MARCH, 21);
        Equipo equipoE = new Equipo("EquipoE", "Sevilla", calendar.getTime());
        equipoRepository.save(equipoE);

        System.out.println(equipoA.toString());
        System.out.println(equipoB.toString());
        System.out.println(equipoC.toString());
        System.out.println(equipoD.toString());
        System.out.println(equipoE.toString());
    }

    public void consultas(){
        System.out.println("Equipo por localidad: " + equipoRepository.findByLocalizacion("Barcelona"));
    }
}
