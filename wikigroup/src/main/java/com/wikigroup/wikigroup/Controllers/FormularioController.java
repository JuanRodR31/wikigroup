package com.wikigroup.wikigroup.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wikigroup.wikigroup.Entities.Persona;
import com.wikigroup.wikigroup.Repositories.PersonaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/api")
public class FormularioController {
    @Autowired
    private PersonaRepository personaRepository;

    @PostMapping("/create")
    public Persona postMethodName(@RequestBody Persona persona) {       
        return personaRepository.save(persona);
    }
    
}
