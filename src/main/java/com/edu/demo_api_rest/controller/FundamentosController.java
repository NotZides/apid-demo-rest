package com.edu.demo_api_rest.controller;

import com.edu.demo_api_rest.model.APIResponse;
import com.edu.demo_api_rest.service.IFundamentosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RequiredArgsConstructor

@RestController
@RequestMapping("/api/v1/fundamentos")
public class FundamentosController {

    private final IFundamentosService iFundamentosService;

    public FundamentosController(IFundamentosService iFundamentosService) {
        this.iFundamentosService = iFundamentosService;
    }

    @GetMapping("/ejercicio1")

    public String ejercicio1(){
        return "Hola xd";
    }

    @RequestMapping("/primo")
    public ResponseEntity<APIResponse<String>> validarPrimo (@RequestParam int numero){
        String respuesta = iFundamentosService.validarNumeroPrimo(numero);

        APIResponse<String> response = new APIResponse<>();
        response.setData(respuesta);
        response.setMensaje("Ejercicio ejecutado correctamente");
        return ResponseEntity.ok(response);
    }
}

@RequestMapping("/factorial")
public ResponseEntity<APIResponse<String>> factorial (@RequestParam int numero){
    String respuesta = iFundamentosService.(numero);

    APIResponse<String> response = new APIResponse<>();
    response.setData(respuesta);
    response.setMensaje("Ejercicio ejecutado correctamente");
    return ResponseEntity.ok(response);
}

@RequestMapping("/fibonacci")
public ResponseEntity<APIResponse<String>> fibonacci (@RequestParam int numero){
    String respuesta = iFundamentosService.calcularFibonnaci(numero);

    APIResponse<String> response = new APIResponse<>();
    response.setData(respuesta);
    response.setMensaje("Ejercicio ejecutado correctamente");
    return ResponseEntity.ok(response);
}


//copiar lo mismo alv