
package br.com.hjsystems.gestaoweb.nfeweb.exception;

import javax.swing.JOptionPane;

/**
 * Excecao a ser lancada na ocorrencia de falhas provenientes da Nota Fiscal Eletronica.
 * 
 */
public class NfeException extends Exception {

	private static final long serialVersionUID = -5054900660251852366L;
	
	String message;
	
	/**
	 * Construtor da classe.
	 * 
	 * @param e
	 */
	public NfeException(Throwable e) {
		super(e);
	}

	
	/**
	 * Construtor da classe.
	 * 
	 * @param code
	 */
	public NfeException(String message) {
		this((Throwable) null);
		this.message = message;
                JOptionPane.showMessageDialog(null, "Mensagem de Erro: " + message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}