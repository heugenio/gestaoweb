package br.com.hjsystems.gestaoweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@EnableWebSecurity
public class GestaowebApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaowebApplication.class, args);
	}
}
