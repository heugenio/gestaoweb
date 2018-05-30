/**
 *
 * Hj-Systems
 * @author Daniel
 * @data 26 de mai de 2018
 *
 */
package br.com.hjsystems.gestaoweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hjsystems.gestaoweb.entity.Profissoes;

public interface ProfissoesRepository extends JpaRepository<Profissoes, String> {

}
