package com.curso.fiap.curso.fiap.model.mapper;

import org.mapstruct.Mapper;
import com.curso.fiap.curso.fiap.model.dto.ConteudoResponseDTO;
import com.curso.fiap.curso.fiap.model.entity.Conteudo;

@Mapper(componentModel = "spring")
public interface ConteudoMapper {

  ConteudoResponseDTO conteudoToConteudoResponseDTO(Conteudo conteudo);
}
