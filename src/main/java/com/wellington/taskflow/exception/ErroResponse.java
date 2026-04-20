package com.wellington.taskflow.exception;

import java.time.LocalDateTime;

public class ErroResponse {

    private LocalDateTime timestamp;
    private int status;
    private String erro;

    public ErroResponse(LocalDateTime timestamp, int status, String erro) {
        this.timestamp = timestamp;
        this.status = status;
        this.erro = erro;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getStatus() {
        return status;
    }

    public String getErro() {
        return erro;
    }
}