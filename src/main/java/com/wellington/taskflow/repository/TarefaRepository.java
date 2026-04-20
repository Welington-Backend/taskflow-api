package com.wellington.taskflow.repository;

import com.wellington.taskflow.model.Tarefa;
import com.wellington.taskflow.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    List<Tarefa> findByUsuario(Usuario usuario);

    Optional<Tarefa> findByIdAndUsuario(Long id, Usuario usuario);
}