package com.danielnunesro.controle.dtos;

public class RequestDTO {
	
	private String name;
	
	public RequestDTO() {
		
	}

	public RequestDTO(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
