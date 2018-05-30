/**
 *
 * Hj-Systems
 * @author Daniel
 * @data 21 de mai de 2018
 *
 */
package br.com.hjsystems.gestaoweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.hjsystems.gestaoweb.entity.Pessoas;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, String>{

	@Query("Select p from Pessoas p where p.pessCpfcnpj like %?1%")
	List<Pessoas> findByCPF(String pessoaCPF);
	
	@Query("Select p from Pessoas p where p.pessNome like %?1%")
	List<Pessoas> findByNome(String pessoaNome);
	
	@Query(value = "select PESS_ESCOLARIDADE from PESSOAS\r\n" + 
			"where PESS_ESCOLARIDADE is not null\r\n" + 
			"GROUP BY PESS_ESCOLARIDADE", nativeQuery = true)
	List<String> findEscolaridade();
	
	@Query(value = "select PESS_ESTADO_CIVIL from PESSOAS\r\n" + 
			"where PESS_ESTADO_CIVIL is not null\r\n" + 
			"GROUP BY PESS_ESTADO_CIVIL", nativeQuery = true)
	List<String> findEstadoCivil();

}
