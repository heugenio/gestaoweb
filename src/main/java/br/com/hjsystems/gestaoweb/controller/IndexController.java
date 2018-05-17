package br.com.hjsystems.gestaoweb.controller;

import java.security.KeyStore;
import java.security.Provider;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hjsystems.gestaoweb.nfeweb.util.CertificadoUtil;

@Controller
public class IndexController {
	
	public static KeyStore ksFixo = null;
    public static Provider pr_token = null;
    public static CertificadoUtil certUtil;
		
	@RequestMapping("/")
    public String indexTemplate(Model model) {
        return "index";
    }

}
