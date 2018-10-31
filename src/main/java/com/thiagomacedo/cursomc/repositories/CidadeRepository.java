package com.thiagomacedo.cursomc.repositories;

import com.thiagomacedo.cursomc.domain.Categoria;
import com.thiagomacedo.cursomc.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
