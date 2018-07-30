/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.repository;

import br.com.hjsystems.gestaoweb.entity.Municipios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Daniel
 */
public interface MunicipiosRepository extends JpaRepository<Municipios, String> {
    
    @Query("select m from Municipios m  where m.estaId.estaId = ?1")
    List<Municipios> findByEstadoId(String estaId);
}
