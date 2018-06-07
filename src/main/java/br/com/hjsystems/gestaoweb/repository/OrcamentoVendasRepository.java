/**
 *
 * Hj-Systems
 * @author Daniel
 * @data 5 de jun de 2018
 *
 */
package br.com.hjsystems.gestaoweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.hjsystems.gestaoweb.entity.OrcamentosVendas;
import br.com.hjsystems.gestaoweb.entity.Pessoas;

public interface OrcamentoVendasRepository extends JpaRepository<OrcamentosVendas, String> {
	
	@Query("select ov from OrcamentosVendas ov where ov.pessId = ?1")
	List<OrcamentosVendas> findByPessoa(Pessoas pess);

}
