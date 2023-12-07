package com.catolica.mini.curso.jenkins.servicies;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public String hello(){
        return "Bem Vindo ao Curso de jenkins";
    }

    public int somar(int a, int b){
        return a+b;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

}
