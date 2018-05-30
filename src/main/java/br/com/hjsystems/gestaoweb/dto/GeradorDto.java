/**
 *
 * Hj-Systems
 * @author Daniel
 * @data 28 de mai de 2018
 *
 */
package br.com.hjsystems.gestaoweb.dto;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class GeradorDto {

	@PersistenceContext
	private EntityManager em;

	// unem=000640010001
	public String geraId(String unemId, String tabela) {
		String query = "DECLARE @out_id varchar(22) \r\n" + "      , @in_unem_id     varchar(22)\r\n"
				+ "	  , @in_tipo        varchar(20)\r\n" + "      , @in_nome_tabela varchar(40)\r\n" + "\r\n"
				+ "SET @in_unem_id = :unem \r\n" + "SET @in_tipo  = 'ID'\r\n" + "SET @in_nome_tabela = :tabela \r\n"
				+ "SET @out_id = ''\r\n" + "\r\n" + "EXEC dbo.sp_Formata_Id\r\n" + "   @in_unem_id \r\n"
				+ "  ,@in_tipo\r\n" + "  ,@in_nome_tabela\r\n" + "  ,@out_id OUT\r\n" + "\r\n" + "SELECT @out_id as id";

		Query q = em.createNativeQuery(query);
		q.setParameter("tabela", tabela);
		q.setParameter("unem", unemId);
		Object objeto = q.getSingleResult();

		return objeto.toString();
	}

	// unem=000640010001
	public String geraCodigo(String unemId, String tabela) {
		String query = "DECLARE @out_id varchar(22) \r\n" + "      , @in_unem_id     varchar(22)\r\n"
				+ "	  , @in_tipo        varchar(20)\r\n" + "      , @in_nome_tabela varchar(40)\r\n" + "\r\n"
				+ "SET @in_unem_id = :unem \r\n" + "SET @in_tipo  = 'CODIGO'\r\n" + "SET @in_nome_tabela = :tabela \r\n"
				+ "SET @out_id = ''\r\n" + "\r\n" + "EXEC dbo.sp_Formata_Id\r\n" + "   @in_unem_id \r\n"
				+ "  ,@in_tipo\r\n" + "  ,@in_nome_tabela\r\n" + "  ,@out_id OUT\r\n" + "\r\n" + "SELECT @out_id as id";

		Query q = em.createNativeQuery(query);
		q.setParameter("tabela", tabela);
		q.setParameter("unem", unemId);
		Object objeto = q.getSingleResult();

		return objeto.toString();
	}
}
