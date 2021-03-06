/**
 * <p>
 * Ajude Mais - Módulo Web Service
 * </p>
 * 
 * <p>
 * Sistema para potencializar o processo de doação.
 * </p>
 * 
 * <a href="https://github.com/AjudeMais/AjudeMais">Ajude Mais</a>
 * <a href="https://franckaj.github.io">Franck Aragão"></a>
 * 
 * AJUDE MAIS - 2017®
 * 
 */
package br.edu.ifpb.ajudeMais.service.exceptions;


/**
 * 
 * <p>
 * <b> UniqueValueAlreadyException.java </b>
 * </p>
 *
 * <p>
 * Exception para valores de atributos unicos
 * </p>
 * 
 * @author <a href="https://github.com/JoseRafael97">Rafael Feitosa</a>
 */
public class UniqueConstraintAlreadyException extends AjudeMaisException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Construtor com messagem de exceção.
	 */
	public UniqueConstraintAlreadyException(String message) {
		super(message);
	}

}
