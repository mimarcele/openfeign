package com.example.produtor.controller;


import com.example.produtor.dto.ProdutorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProdutorController {

    @GetMapping
    public ProdutorResponse retornaUsuario(){
        return ProdutorResponse.builder().id(1L).nome("Milena").sobrenome("Marcele").idade(21).build();
    }
}
