package com.wikigroup.wikigroup.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wikigroup.wikigroup.Entities.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

