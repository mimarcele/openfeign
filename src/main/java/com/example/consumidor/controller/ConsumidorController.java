package com.example.consumidor.controller;


import com.example.consumidor.dto.ConsumidorResponse;
import com.example.consumidor.openFeign.Consumidor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
@RequiredArgsConstructor
public class ConsumidorController {

    private final Consumidor consumidor;

    @GetMapping
    public ResponseEntity<ConsumidorResponse> retornaUsuario(){
        return ResponseEntity.ok(consumidor.retornaUsuario());
    }


}
