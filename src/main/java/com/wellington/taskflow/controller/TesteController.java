package com.wellington.taskflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste-auth")
    public String testeAuth() {
        return "Autenticado com sucesso!";
    }
}