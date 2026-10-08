package com.examen.impuestos.controller;

import com.examen.impuestos.model.Contribuyente;
import com.examen.impuestos.service.ContribuyenteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/contribuyentes")
public class ContribuyenteController {

    private final ContribuyenteService service;

    public ContribuyenteController(ContribuyenteService service) {
        this.service = service;
    }

    // Mostrar lista
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaContribuyentes", service.listarTodos());
        return "contribuyentes"; // Retorna al archivo contribuyentes.html
    }

    // Mostrar formulario para crear uno nuevo
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("contribuyente", new Contribuyente());
        return "formulario_contribuyente"; // Retorna al HTML del formulario
    }

    // Guardar en base de datos y redirigir
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Contribuyente contribuyente) {
        service.guardar(contribuyente);
        return "redirect:/contribuyentes"; // Recarga la lista
    }
}