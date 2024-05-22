package com.danielnunesro.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danielnunesro.controle.dtos.RequestDTO;
import com.danielnunesro.controle.entities.Ponto;
import com.danielnunesro.controle.services.PontoService;

@RestController
@RequestMapping("/")
public class PontoController {
	
	@Autowired
	private PontoService service;
	
	@GetMapping
	public ResponseEntity<List<Ponto>> findAll() {
		return ResponseEntity.ok().body(service.findAll());
	}
	
	
	@PostMapping("/create")
	public ResponseEntity<Ponto> create(@RequestBody Ponto ponto) {
		 service.create(ponto);
		 return ResponseEntity.ok().body(ponto);
	}
	
}
