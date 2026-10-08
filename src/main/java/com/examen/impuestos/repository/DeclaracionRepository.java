package com.examen.impuestos.repository;

import com.examen.impuestos.model.Declaracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclaracionRepository extends JpaRepository<Declaracion, Integer> {
}