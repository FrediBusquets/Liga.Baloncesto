package com.example.Repository;

import com.example.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by jhipster on 3/12/15.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {

public Equipo findByNombreclub(String nombreclub);
public List<Equipo> findByLocalizacion(String localizacion);

        }
