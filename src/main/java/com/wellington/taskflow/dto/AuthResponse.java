package com.wellington.taskflow.dto;

public class AuthResponse {

    private String token;
    private String tipo;

    public AuthResponse() {
    }

    public AuthResponse(String token, String tipo) {
        this.token = token;
        this.tipo = tipo;
    }

    public String getToken() {
        return token;
    }

    public String getTipo() {
        return tipo;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}