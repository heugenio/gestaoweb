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

import br.com.hjsystems.gestaoweb.entity.DocumentosFiscais;
import br.com.hjsystems.gestaoweb.entity.Pessoas;

public interface DocumentosFiscaisRepository extends JpaRepository<DocumentosFiscais, String> {

	@Query("select df from DocumentosFiscais df where df.dcfsPessId = ?1")
	List<DocumentosFiscais> findByPessoa(Pessoas pess);
}
