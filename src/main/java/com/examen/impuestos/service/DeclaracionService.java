package com.examen.impuestos.service;


import com.examen.impuestos.model.Declaracion;
import com.examen.impuestos.repository.DeclaracionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DeclaracionService {

    private final DeclaracionRepository repository;

    public DeclaracionService(DeclaracionRepository repository) {
        this.repository = repository;
    }

    public List<Declaracion> listarTodas() {
        return repository.findAll();
    }

    public void guardar(Declaracion declaracion) {
        repository.save(declaracion);
    }
    
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}