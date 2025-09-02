package com.breno.gerenciador_tarefas.service;

import com.breno.gerenciador_tarefas.model.Tarefa;
import com.breno.gerenciador_tarefas.repository.tarefaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class tarefaServico {

    private final tarefaRepositorio repositorio;

    public tarefaServico(tarefaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public List<Tarefa> listarTodas() {
        return repositorio.findAll();
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return repositorio.findById(id);
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repositorio.save(tarefa);
    }

    public void deletarPorId(Long id) {
        repositorio.deleteById(id);
    }
}