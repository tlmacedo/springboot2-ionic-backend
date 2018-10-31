package com.thiagomacedo.cursomc.services;

import com.thiagomacedo.cursomc.domain.Cliente;
import com.thiagomacedo.cursomc.repositories.ClienteRepository;
import com.thiagomacedo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repo;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(String.format("Objeto não encontrado! Id: %d, Tipo: %s", id, Cliente.class.getName())));
    }
}
