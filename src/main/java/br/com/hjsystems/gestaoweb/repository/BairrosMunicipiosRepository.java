/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.repository;

import br.com.hjsystems.gestaoweb.entity.BairrosMunicipios;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Daniel
 */
public interface BairrosMunicipiosRepository extends JpaRepository<BairrosMunicipios, String> {
    
    @Query("select bm from BairrosMunicipios bm where bm.muniId.muniId = ?1")
    List<BairrosMunicipios> findByMuniId(String muniId);
    
}
