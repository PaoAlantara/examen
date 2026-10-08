package com.examen.impuestos.controller;

import com.examen.impuestos.model.Declaracion;
import com.examen.impuestos.service.ContribuyenteService;
import com.examen.impuestos.service.DeclaracionService;
import com.examen.impuestos.service.ImpuestoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/declaraciones")
public class DeclaracionController {

    private final DeclaracionService declaracionService;
    private final ContribuyenteService contribuyenteService;
    private final ImpuestoService impuestoService;

    public DeclaracionController(DeclaracionService declaracionService, 
                                 ContribuyenteService contribuyenteService, 
                                 ImpuestoService impuestoService) {
        this.declaracionService = declaracionService;
        this.contribuyenteService = contribuyenteService;
        this.impuestoService = impuestoService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("listaDeclaraciones", declaracionService.listarTodas());
        return "declaraciones";
    }

    @GetMapping("/nueva")
    public String mostrarFormulario(Model model) {
        model.addAttribute("declaracion", new Declaracion());
        // Pasamos las listas para llenar los menús desplegables (Selects)
        model.addAttribute("contribuyentes", contribuyenteService.listarTodos());
        model.addAttribute("impuestos", impuestoService.listarTodos());
        return "formulario_declaracion";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Declaracion declaracion) {
        declaracionService.guardar(declaracion);
        return "redirect:/declaraciones";
    }
}