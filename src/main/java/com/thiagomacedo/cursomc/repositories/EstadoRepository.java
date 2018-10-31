package com.thiagomacedo.cursomc.repositories;

import com.thiagomacedo.cursomc.domain.Categoria;
import com.thiagomacedo.cursomc.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
}
