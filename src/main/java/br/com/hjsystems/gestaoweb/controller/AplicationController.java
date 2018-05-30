package br.com.hjsystems.gestaoweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AplicationController {

	@RequestMapping("/")
    public String indexTemplate(Model model) {
        return "index";
    }
	
	@RequestMapping("/mensagem")
    public String mensagem(Model model) {
        return "fragments/template-mensagem";
    }
	

}
