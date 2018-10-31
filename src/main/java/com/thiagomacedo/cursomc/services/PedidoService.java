package com.thiagomacedo.cursomc.services;

import com.thiagomacedo.cursomc.domain.Pedido;
import com.thiagomacedo.cursomc.repositories.PedidoRepository;
import com.thiagomacedo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(String.format("Objeto não encontrado! Id: %d, Tipo: %s", id, Pedido.class.getName())));
    }
}
