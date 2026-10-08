package com.examen.impuestos.repository;

import com.examen.impuestos.model.Contribuyente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContribuyenteRepository extends JpaRepository<Contribuyente, Integer> {
}
