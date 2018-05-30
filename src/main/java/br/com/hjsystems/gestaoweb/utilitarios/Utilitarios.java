/**
 *
 * Hj-Systems
 * @author Daniel
 * @data 28 de mai de 2018
 *
 */
package br.com.hjsystems.gestaoweb.utilitarios;

public class Utilitarios {

	
	public static String removeCaracteres(String texto) {
		texto = texto.replaceAll("[^0-9]", "");
		return texto;
	}
	
}
