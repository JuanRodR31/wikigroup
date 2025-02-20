package com.wikigroup.wikigroup.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wikigroup.wikigroup.Entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
}

