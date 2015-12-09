package com.example.Repository;

import com.example.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by jhipster on 3/12/15.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {

    public Liga findByNombreliga(String nombreliga);


}