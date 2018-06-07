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

import br.com.hjsystems.gestaoweb.entity.Pedidos;
import br.com.hjsystems.gestaoweb.entity.Pessoas;

public interface PedidosRepository extends JpaRepository<Pedidos, String> {

	@Query("select p from Pedidos p where p.pessId = ?1")
	List<Pedidos> findByPessoa(Pessoas pess);
}
