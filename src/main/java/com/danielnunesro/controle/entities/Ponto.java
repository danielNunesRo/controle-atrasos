package com.danielnunesro.controle.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ponto")
public class Ponto implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private LocalDate date;
	@Column(nullable = false)
	private LocalTime hours;
	
	private Ponto() {
		
	}

	public Ponto(Long id, String name, LocalDate date, LocalTime hours) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.hours = hours;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getHours() {
		return hours;
	}

	public void setHours(LocalTime hours) {
		this.hours = hours;
	}
	
	
	
}
