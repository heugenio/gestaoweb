package br.com.hjsystems.gestaoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import br.com.hjsystems.gestaoweb.controller.AplicationController;

@SpringBootApplication
@EnableWebSecurity
@ComponentScan(basePackageClasses = {AplicationController.class})
public class GestaowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaowebApplication.class, args);
	}
}
