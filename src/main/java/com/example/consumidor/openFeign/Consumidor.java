package com.example.consumidor.openFeign;

import com.example.consumidor.dto.ConsumidorResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "producer", url = "http://localhost:8081/producer")
public interface Consumidor {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    ConsumidorResponse retornaUsuario();
}
