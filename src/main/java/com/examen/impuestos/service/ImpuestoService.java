package com.examen.impuestos.service;



import com.examen.impuestos.model.Impuesto;
import com.examen.impuestos.repository.ImpuestoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ImpuestoService {

    private final ImpuestoRepository repository;

    public ImpuestoService(ImpuestoRepository repository) {
        this.repository = repository;
    }

    public List<Impuesto> listarTodos() {
        return repository.findAll();
    }

    public void guardar(Impuesto impuesto) {
        repository.save(impuesto);
    }
}