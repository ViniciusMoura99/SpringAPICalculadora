package com.example.calculadora.calc.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/api/calculadora")
public interface CalculadoraRest {

    @GetMapping("/soma/{numeroUm}/{numeroDois}")
    ResponseEntity<Object> getSoma(@PathVariable(value = "numeroUm") Integer num, @PathVariable(value = "numeroDois") Integer num2);

    @GetMapping("/menos/{numeroUm}/{numeroDois}")
    ResponseEntity<Object> getMenos(@PathVariable(value = "numeroUm") Integer num, @PathVariable(value = "numeroDois") Integer num2);

    @GetMapping("/mult/{numeroUm}/{numeroDois}")
    ResponseEntity<Object> getMult(@PathVariable(value = "numeroUm") Integer num, @PathVariable(value = "numeroDois") Integer num2);

    @GetMapping("/div/{numeroUm}/{numeroDois}")
    ResponseEntity<Object> getDiv(@PathVariable(value = "numeroUm") Integer num, @PathVariable(value = "numeroDois") Integer num2);





}

