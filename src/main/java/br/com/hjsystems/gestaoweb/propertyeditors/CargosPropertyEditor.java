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

import br.com.hjsystems.gestaoweb.entity.Cargos;
import br.com.hjsystems.gestaoweb.repository.CargosRepository;

@Component
public class CargosPropertyEditor extends PropertyEditorSupport{
	
	@Autowired
	CargosRepository cargoRepo;
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Cargos cargo = cargoRepo.findById(text).get();
		setValue(cargo);
	}
}
