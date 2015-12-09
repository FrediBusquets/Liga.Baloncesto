package com.example.Service;

import com.example.Model.Equipo;
import com.example.Model.Liga;
import com.example.Model.Temporada;
import com.example.Repository.EquipoRepository;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 3/12/15.
 */
@Service
public class TemporadaService {
    @Autowired
    private TemporadaRepository temporadaRepository;
    @Autowired
    private LigaRepository ligaRepository;
    @Autowired
    private EquipoRepository equipoRepository;

    public void nuevaTemporada(){
        Calendar calendar = GregorianCalendar.getInstance();

        Liga liga = ligaRepository.findByNombreliga("ACB");

        Equipo equipoA = equipoRepository.findByNombreclub("EquipoA");
        Equipo equipoB = equipoRepository.findByNombreclub("EquipoB");
        Equipo equipoC = equipoRepository.findByNombreclub("EquipoC");
        Equipo equipoD = equipoRepository.findByNombreclub("EquipoD");
        Equipo equipoE = equipoRepository.findByNombreclub("EquipoE");

        calendar.set(2014, Calendar.JANUARY, 1);
        Temporada temporada1 = new Temporada (calendar.getTime());
        temporada1.setLiga(liga);
        temporada1.getEquipos().add(equipoA);
        temporada1.getEquipos().add(equipoC);
        temporadaRepository.save(temporada1);

        calendar.set(2015, Calendar.JANUARY, 1);
        Temporada temporada2 = new Temporada(calendar.getTime());
        temporada2.setLiga(liga);
        temporada2.getEquipos().add(equipoB);
        temporada2.getEquipos().add(equipoD);
        temporada2.getEquipos().add(equipoE);
        temporadaRepository.save(temporada2);

        System.out.println(temporada1.toString());
        System.out.println(temporada2.toString());
    }
}
