package com.wikigroup.wikigroup.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wikigroup.wikigroup.Entities.Persona;
import com.wikigroup.wikigroup.Repositories.PersonaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FormularioController {
    @Autowired
    private PersonaRepository personaRepository;

    @PostMapping("/create")
    public Persona postMethodName(@RequestBody Persona persona) {       
        return personaRepository.save(persona); 
    }
}
