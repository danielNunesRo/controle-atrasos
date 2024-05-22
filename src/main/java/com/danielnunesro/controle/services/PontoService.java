package com.danielnunesro.controle.services;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielnunesro.controle.entities.Atrasado;
import com.danielnunesro.controle.entities.Ponto;
import com.danielnunesro.controle.repositories.AtrasadoRepository;
import com.danielnunesro.controle.repositories.PontoRepository;

@Service
public class PontoService {
	
	@Autowired
	private PontoRepository repository;
	
	@Autowired
	private AtrasadoRepository atrasadoRepository;
	
	
	public Ponto create(Ponto ponto) {
	    var existingPonto = repository.findByName(ponto.getName()).orElse(null);
	    
	    if(existingPonto != null && existingPonto.getDate().equals(ponto.getDate())) {
	    	throw new RuntimeException("Ponto já cadastrado no dia");
	    }
	    
	    LocalTime entradaManhã = LocalTime.of(7, 10);
	    LocalTime meioDia = LocalTime.of(12, 0);
	    LocalTime entradaTarde = LocalTime.of(13, 20);
	    LocalTime fimExpediente = LocalTime.of(18, 0);
	    
	    
	    if (ponto.getHours().isBefore(meioDia) && ponto.getHours().isAfter(entradaManhã)) {
	    	Atrasado atrasado = new Atrasado(null, ponto.getName(), ponto.getDate(), ponto.getHours());
	    	atrasadoRepository.save(atrasado);
	    }

	    return repository.save(ponto);
	}
	
	public List<Ponto> findAll() {
		return repository.findAll();
	}
	
}
