package com.danielnunesro.controle.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class ResponseDTO {
	
	private String name;
	
	private LocalDate date;
	
	private LocalTime hours;
	
	public ResponseDTO() {
		
	}

	public ResponseDTO(String name, LocalDate date, LocalTime hours) {
		this.name = name;
		this.date = date;
		this.hours = hours;
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
