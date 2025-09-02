package com.breno.gerenciador_tarefas.controller;

import com.breno.gerenciador_tarefas.model.Tarefa;
import com.breno.gerenciador_tarefas.service.tarefaServico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
@CrossOrigin(origins = "*") // Permite acesso de qualquer origem (ajuste conforme necessário)
public class tarefaControlador {

    private final tarefaServico servico;

    public tarefaControlador(tarefaServico servico) {
        this.servico = servico;
    }

    @GetMapping
    public List<Tarefa> listarTodas() {
        return servico.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        return servico.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return servico.salvar(tarefa);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tarefa> atualizar(@PathVariable Long id, @RequestBody Tarefa tarefa) {
        return servico.buscarPorId(id)
                .map(tarefaExistente -> {
                    tarefaExistente.setTitulo(tarefa.getTitulo());
                    tarefaExistente.setDescricao(tarefa.getDescricao());
                    tarefaExistente.setPrioridade(tarefa.getPrioridade());
                    tarefaExistente.setConcluida(tarefa.isConcluida());
                    return ResponseEntity.ok(servico.salvar(tarefaExistente));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (servico.buscarPorId(id).isPresent()) {
            servico.deletarPorId(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}