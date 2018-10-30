package com.thiagomacedo.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources implements Serializable {

    private static final long serialVersionUID = 1L;

    @RequestMapping(method = RequestMethod.GET)
    public String listar() {
        return "REST está funcionando!";
    }

}
