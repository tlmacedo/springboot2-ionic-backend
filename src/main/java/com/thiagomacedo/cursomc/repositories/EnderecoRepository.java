package com.thiagomacedo.cursomc.repositories;

import com.thiagomacedo.cursomc.domain.Cidade;
import com.thiagomacedo.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}