package com.example.Service;

/**
 * Created by jhipster on 1/12/15.
 */
import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugadores() {
        Calendar calendar = GregorianCalendar.getInstance();

        Equipo equipoA = equipoRepository.findByNombreclub("EquipoA");
        Equipo equipoB = equipoRepository.findByNombreclub("EquipoB");
        Equipo equipoC = equipoRepository.findByNombreclub("EquipoC");
        Equipo equipoD = equipoRepository.findByNombreclub("EquipoD");
        Equipo equipoE = equipoRepository.findByNombreclub("EquipoE");

        calendar.set(1995, Calendar.JANUARY, 1);
        Jugador jugador1 = new Jugador("Jorge",calendar.getTime(),530,450,470,"Base");

        jugador1.setEquipo(equipoA);
        jugadorRepository.save(jugador1);

        calendar.set(1989, Calendar.FEBRUARY, 15);
        Jugador jugador2 = new Jugador("Pablo",calendar.getTime(),780,650,320,"Alero");

        jugador2.setEquipo(equipoB);
        jugadorRepository.save(jugador2);

        calendar.set(1993, Calendar.MARCH, 27);
        Jugador jugador3 = new Jugador("Javier",calendar.getTime(),870,520,460,"Pivot");
        jugador3.setEquipo(equipoC);
        jugadorRepository.save(jugador3);

        calendar.set(1994, Calendar.SEPTEMBER, 21);
        Jugador jugador4 = new Jugador("Fredy",calendar.getTime(),320,820,580,"Alero-Pivot");

        jugador4.setEquipo(equipoD);
        jugadorRepository.save(jugador4);

        calendar.set(1995, Calendar.SEPTEMBER, 11);
        Jugador jugador5 = new Jugador("Alejandro",calendar.getTime(),730,623,458,"Escolta");
        jugador5.setEquipo(equipoE);
        jugadorRepository.save(jugador5);

        System.out.println("Buscar nombre que comienze por:");
        System.out.println(jugadorRepository.findByNombreStartingWith("Ale"));
        System.out.println("Anotaciones igual a o mejor a:");
        System.out.println(jugadorRepository.findByanotacionesGreaterThanEqual(30));
        System.out.println("Asistencias entre:");
        System.out.println(jugadorRepository.findByAsistenciasBetween(400, 500));
        System.out.println("Posicion igual a:");
        System.out.println(jugadorRepository.findByPosicionLike("escolta"));
        calendar.set(1995, Calendar.SEPTEMBER, 12);
        System.out.println("Nacimiento antes de:");
        System.out.println(jugadorRepository.findByDianacimientoBefore(calendar.getTime()));
        calendar.set(1994, Calendar.SEPTEMBER, 22);
        System.out.println("Anotaciones igual a o mayores a y nacimiento antes de...");
        System.out.println(jugadorRepository.findByAnotacionesGreaterThanEqualAndDianacimientoBefore(500, calendar.getTime()));
    }
}