package com.smpcomponentes.models.dao;

import com.smpcomponentes.models.entity.Componente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IComponenteDao extends CrudRepository<Componente, Integer> {
    @Query(value = "SELECT * FROM componentes c WHERE c.categoria_id = ?1 ORDER BY c.nombre", nativeQuery = true)
    List<Componente> findByCategoriaId(Integer categoriaId);

    @Query(value = "SELECT * FROM componentes c WHERE c.fabricante_id = ?1 ORDER BY c.nombre", nativeQuery = true)
    List<Componente> findByFabricanteId(Integer fabricanteId);
}
