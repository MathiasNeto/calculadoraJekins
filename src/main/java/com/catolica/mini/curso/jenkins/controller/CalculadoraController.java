package com.catolica.mini.curso.jenkins.controller;

import com.catolica.mini.curso.jenkins.servicies.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("Calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/hello")
    public String hello(){
        return calculadoraService.hello();
    }
    @GetMapping("/somar/{a}/{b}")
    public int somar(@PathVariable int a, int b){
        return calculadoraService.somar(a, b);
    }
    @GetMapping("/subtrair/{a}/{b}")
    public int substrair(@PathVariable int a, int b){
        return calculadoraService.subtrair(a, b);
    }
}
