package com.breno.gerenciador_tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Início");
        model.addAttribute("cssPagina", "home");
        model.addAttribute("jsPagina", "tarefas");
        model.addAttribute("conteudo", "tarefas");
        return "base";
    }

    @GetMapping("/tarefas")
    public String tarefas(Model model) {
        model.addAttribute("titulo", "Lista de Tarefas");
        model.addAttribute("cssPagina", "tarefas");
        model.addAttribute("jsPagina", "tarefas");
        model.addAttribute("conteudo", "tarefas");
        return "base";
    }
}