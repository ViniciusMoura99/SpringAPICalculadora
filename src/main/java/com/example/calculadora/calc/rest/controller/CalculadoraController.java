package com.example.calculadora.calc.rest.controller;


import com.example.calculadora.calc.rest.CalculadoraRest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController implements CalculadoraRest {


    @Override
    public ResponseEntity<Object> getSoma(Integer num, Integer num2) {
        Integer resp;

        resp = num + num2;

        return ResponseEntity.ok(resp);
    }

    @Override
    public ResponseEntity<Object> getMenos(Integer num, Integer num2) {
        Integer resp;

        resp = num - num2;

        return ResponseEntity.ok(resp);
    }

    @Override
    public ResponseEntity<Object> getMult(Integer num, Integer num2) {
        Integer resp;

        resp = num * num2;

        return ResponseEntity.ok(resp);
    }

    @Override
    public ResponseEntity<Object> getDiv(Integer num, Integer num2) {
        Integer resp;

        resp = num / num2;

        return ResponseEntity.ok(resp);
    }
}
