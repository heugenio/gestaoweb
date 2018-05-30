/**
 *
 * Hj-Systems
 * @author Daniel
 * @data 28 de mai de 2018
 *
 */
package br.com.hjsystems.gestaoweb.propertyeditors;

import java.beans.PropertyEditorSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.hjsystems.gestaoweb.entity.Nacionalidades;
import br.com.hjsystems.gestaoweb.repository.NacionalidadesRepository;

@Component
public class NacionalidadesPropertyEditor extends PropertyEditorSupport {
	
	@Autowired
	NacionalidadesRepository nacionalidadeRepo;
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Nacionalidades nacio = nacionalidadeRepo.findById(text).get();
		setValue(nacio);
	}
}
