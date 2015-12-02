package com.example.Repository;

/**
 * Created by jhipster on 1/12/15.
 */

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.Date;
import java.util.List;


public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {

    List<Jugador> findByNombreStartingWith(String nombre);

    List<Jugador> findByanotacionesGreaterThanEqual(int anotaciones);

    List<Jugador> findByAsistenciasBetween(int minimo, int maximo);

    List<Jugador> findByPosicionLike(String posicion);

    List<Jugador> findByDianacimientoBefore(Date fecha);

    List<Jugador> findByAnotacionesGreaterThanEqualAndDianacimientoBefore(int anotaciones, Date dianacimiento);


}