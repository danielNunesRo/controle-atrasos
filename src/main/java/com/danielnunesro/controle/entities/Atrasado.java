package com.danielnunesro.controle.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Atrasado {
	
	@Id
	private Long id;
	
	private String name;
	
	private LocalDate date;
	
	private LocalTime hours;
	
	public Atrasado() {
		
	}

	public Atrasado(Long id, String name, LocalDate date, LocalTime hours) {
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
