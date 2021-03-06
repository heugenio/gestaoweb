/**
 *
 * Hj-Systems
 * @author Daniel
 * @data 30 de mai de 2018
 *
 */
package br.com.hjsystems.gestaoweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import br.com.hjsystems.gestaoweb.entity.Pessoas;
import br.com.hjsystems.gestaoweb.entity.Telefones;

public interface TelefonesRepository extends JpaRepository<Telefones, String> {

	@Transactional
	@Modifying
	@Query("delete from Telefones t where t.pessId = ?1")
	void deleteByPessoa (Pessoas pess);
}
