package com.breno.gerenciador_tarefas.repository;

import com.breno.gerenciador_tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tarefaRepositorio extends JpaRepository<Tarefa, Long> {
}