package com.thiagomacedo.cursomc.repositories;

import com.thiagomacedo.cursomc.domain.Categoria;
import com.thiagomacedo.cursomc.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
