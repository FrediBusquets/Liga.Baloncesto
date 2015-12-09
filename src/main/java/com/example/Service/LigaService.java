package com.example.Service;

import com.example.Model.Liga;
import com.example.Repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jhipster on 3/12/15.
 */
@Service
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    public void crearLiga(){
        Liga ligaBaloncesto = new Liga("ACB");
        ligaRepository.save(ligaBaloncesto);

        System.out.println(ligaBaloncesto.toString());
    }
}
