package com.wellington.taskflow.service;

import com.wellington.taskflow.model.Tarefa;
import com.wellington.taskflow.model.Usuario;
import com.wellington.taskflow.repository.TarefaRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    private Usuario getUsuarioLogado() {
        return (Usuario) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public List<Tarefa> listar() {
        Usuario usuario = getUsuarioLogado();
        return repository.findByUsuario(usuario);
    }

    public Tarefa criar(Tarefa tarefa) {
        Usuario usuario = getUsuarioLogado();

        tarefa.setUsuario(usuario);

        if (tarefa.getDataCriacao() == null) {
            tarefa.setDataCriacao(LocalDate.now());
        }

        return repository.save(tarefa);
    }

    public Tarefa buscarPorId(Long id) {
        Usuario usuario = getUsuarioLogado();

        return repository.findByIdAndUsuario(id, usuario)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada."));
    }

    public void deletar(Long id) {
        Usuario usuario = getUsuarioLogado();

        Tarefa tarefa = repository.findByIdAndUsuario(id, usuario)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada."));

        repository.delete(tarefa);
    }
}