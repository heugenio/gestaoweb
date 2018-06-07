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
import br.com.hjsystems.gestaoweb.entity.OrdemServico;
import br.com.hjsystems.gestaoweb.entity.Pessoas;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, String> {

	@Query("select os from OrdemServico os where os.pessId = ?1")
	List<OrdemServico> findByPessoa(Pessoas pess);
}
