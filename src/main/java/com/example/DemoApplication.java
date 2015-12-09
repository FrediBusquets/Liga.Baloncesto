package com.example;

import com.example.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
    @Autowired
    private static JugadorService jugadorService;
    @Autowired
    private static LigaService ligaService;
    @Autowired
    private static EquipoService equipoService;
    @Autowired
    private static TemporadaService temporadaService;

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        jugadorService = context.getBean(JugadorService.class);
        equipoService = context.getBean(EquipoService.class);
        temporadaService = context.getBean(TemporadaService.class);
        ligaService = context.getBean(LigaService.class);


        equipoService.crearEquipos();
        jugadorService.testJugadores();
        temporadaService.nuevaTemporada();
        ligaService.crearLiga();

        equipoService.consultas();
    }
}
