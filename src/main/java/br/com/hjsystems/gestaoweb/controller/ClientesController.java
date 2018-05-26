package br.com.hjsystems.gestaoweb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hjsystems.gestaoweb.entity.Pessoas;
import br.com.hjsystems.gestaoweb.repository.PessoasRepository;

@Controller
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	PessoasRepository pessRepo;
	
	@GetMapping("/manutencao")
    public String indexTemplate(Model model) {
        return "clientes/manutencao_clientes";
        
    }
	
	@GetMapping(value = {"/pesquisa/{tipoPesquisa}/{paramPesquisa}", "/pesquisa/{tipoPesquisa}"})
	public ResponseEntity<List<Pessoas>> buscaClientes(Model model, @PathVariable String tipoPesquisa, @PathVariable Optional<String> paramPesquisa){
		List<Pessoas> listaPessoas = new ArrayList<>();
		String pesquisa = "";
		if(paramPesquisa.isPresent()) {
			pesquisa = paramPesquisa.get();
		}
		
		if(tipoPesquisa.equals("cpf")) {
			listaPessoas = pessRepo.findByCPF(pesquisa);
		}else {
			listaPessoas = pessRepo.findByNome(pesquisa);
		}
		
		return new ResponseEntity<>(listaPessoas, HttpStatus.OK);
	}
	
	@GetMapping("/buscapagina/{ref}")
	public String gereciaPaginas(Model model, @PathVariable String ref) {
		String retorno = "";
		switch (ref) {
		case "alterar":
			retorno = "clientes/alterar_cliente";
			break;
		}
		List<String> listaEscolaridade = pessRepo.findEscolaridade();
		List<String> listaEstadoCivil = pessRepo.findEstadoCivil();
		model.addAttribute("listaEscolaridade", listaEscolaridade);
		model.addAttribute("listaEstadoCivil", listaEstadoCivil);
		return retorno;
	}

}
