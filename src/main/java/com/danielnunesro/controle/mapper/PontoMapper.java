package com.danielnunesro.controle.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.danielnunesro.controle.dtos.RequestDTO;
import com.danielnunesro.controle.entities.Ponto;

@Mapper
public interface PontoMapper {
	
	PontoMapper INSTANCE = Mappers.getMapper(PontoMapper.class);
	
	@Mapping(target = "id", ignore = true)
	Ponto toPonto(RequestDTO pontoDTO);
	
	RequestDTO toDto(Ponto ponto);
	
	List<RequestDTO> toDtoList(List<Ponto> pontoList);
	
}
