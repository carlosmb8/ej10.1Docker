package com.example.dockerizeapp.repository;

import com.example.dockerizeapp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    List<Persona> findByName(String name);
}
