package com.smpcomponentes.models.services;

import com.smpcomponentes.models.entity.Ordenador;

import java.util.List;

public interface IOrdenadorService {

    List<Ordenador> findAll();

    List<Ordenador> findAllLimit();

    Ordenador findById(Integer id);

    List<Ordenador> findByUsuarioId(Integer usuarioId);

    Ordenador save(Ordenador ordenador);

    void delete(Integer id);
}
