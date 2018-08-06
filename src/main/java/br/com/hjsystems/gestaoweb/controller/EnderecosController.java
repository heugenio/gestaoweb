/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hjsystems.gestaoweb.controller;

import br.com.hjsystems.gestaoweb.entity.Enderecos;
import br.com.hjsystems.gestaoweb.repository.EnderecosRepository;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Daniel
 */
@Controller
@RequestMapping("/enderecos")
public class EnderecosController {

    @Autowired
    EnderecosRepository enderecoRepo;

    @PostMapping("/salvar")
    public ResponseEntity<Enderecos> cadastrar(@Valid @ModelAttribute Enderecos ende, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            FieldError error = bindingResult.getFieldErrors().get(0);
            System.out.println(error.getField() + " - " + error.getDefaultMessage());
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
