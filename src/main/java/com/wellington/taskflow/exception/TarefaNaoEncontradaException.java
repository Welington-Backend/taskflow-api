package com.wellington.taskflow.exception;

public class TarefaNaoEncontradaException extends RuntimeException {
    public TarefaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
