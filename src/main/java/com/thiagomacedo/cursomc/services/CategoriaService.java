package com.thiagomacedo.cursomc.services;

import com.thiagomacedo.cursomc.domain.Categoria;
import com.thiagomacedo.cursomc.repositories.CategoriaRepository;
import com.thiagomacedo.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(String.format("Objeto não encontrado! Id: %d, Tipo: %s", id, Categoria.class.getName())));
    }

    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repo.save(obj);
    }
}
