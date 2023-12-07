package com.catolica.mini.curso.jenkins.services;

import com.catolica.mini.curso.jenkins.servicies.CalculadoraService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTestService {

    private CalculadoraService calculadoraService;

    @BeforeEach
    public void init() {
        calculadoraService = new CalculadoraService();
    }
    @Test
    public void deveriaexixbirumamensagem(){
        String msg = "Bem Vindo ao Curso de jenkins";
        Assertions.assertEquals(msg, calculadoraService.hello());
    }

    @Test
    public void deveriasomar(){
        int a = 2, b = 3, result = 5;
        Assertions.assertEquals(result, calculadoraService.somar(a,b));
    }

    @Test
    public void deveriasubtrair(){
        int a = 2, b = 3, result = -1;
        Assertions.assertEquals(result, calculadoraService.subtrair(a,b));
    }
}
