package com.danielnunesro.controle.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielnunesro.controle.entities.Ponto;

public interface PontoRepository extends JpaRepository<Ponto, Long> {
	
	Optional<Ponto> findByName(String name);
	
}
