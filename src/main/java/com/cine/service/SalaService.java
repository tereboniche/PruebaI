package com.cine.service;

import com.cine.entity.Sala;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.cine.repository.SalaRepository;

@Service
public class SalaService implements ISalaService {
    
    /* Indica una conexion entre el servicio y el repositorio */
    @Autowired
    private SalaRepository salaRepository;

    @Override
    public List<Sala> listTheater() {
        return (List<Sala>)salaRepository.findAll();
    }   
}