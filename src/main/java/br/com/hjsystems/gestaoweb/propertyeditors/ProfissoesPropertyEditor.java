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

import br.com.hjsystems.gestaoweb.entity.Profissoes;
import br.com.hjsystems.gestaoweb.repository.ProfissoesRepository;

@Component
public class ProfissoesPropertyEditor extends PropertyEditorSupport {

	@Autowired
	ProfissoesRepository profissoesRepo;

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		Profissoes profi = profissoesRepo.findById(text).get();
		setValue(profi);
	}
}
