package br.com.hjsystems.gestaoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {br.com.hjsystems.gestaoweb.controller.IndexController.class})
public class GestaowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaowebApplication.class, args);
	}
}
