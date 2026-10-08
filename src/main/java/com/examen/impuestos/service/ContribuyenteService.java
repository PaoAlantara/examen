package com.examen.impuestos.service;

import com.examen.impuestos.model.Contribuyente;
import com.examen.impuestos.repository.ContribuyenteRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ContribuyenteService {

    private final ContribuyenteRepository repository;

    // Constructor (Inyección de dependencias)
    public ContribuyenteService(ContribuyenteRepository repository) {
        this.repository = repository;
    }

    public List<Contribuyente> listarTodos() {
        return repository.findAll();
    }

    public void guardar(Contribuyente contribuyente) {
        repository.save(contribuyente);
    }

    public Contribuyente obtenerPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}