package com.example.consumidor.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsumidorResponse {

    private Long id;
    private String nome;
    private String sobrenome;
    private Integer idade;
}
