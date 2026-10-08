package com.examen.impuestos.controller;

import com.examen.impuestos.model.Impuesto;
import com.examen.impuestos.service.ImpuestoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/impuestos")
public class ImpuestoController {

    private final ImpuestoService service;

    public ImpuestoController(ImpuestoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaImpuestos", service.listarTodos());
        return "impuestos"; 
    }

    // NUEVO: Método para mostrar el formulario
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("impuesto", new Impuesto());
        return "formulario_impuesto";
    }

    // NUEVO: Método para guardar en base de datos
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Impuesto impuesto) {
        service.guardar(impuesto);
        return "redirect:/impuestos";
    }
}