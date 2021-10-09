package com.curso.fiap.curso.fiap.model.mapper;

import org.mapstruct.Mapper;
import com.curso.fiap.curso.fiap.model.dto.ModuloResponseDTO;
import com.curso.fiap.curso.fiap.model.entity.Modulo;

@Mapper(componentModel = "spring")
public interface ModuloMapper {

  ModuloResponseDTO moduloToModuloResponseDTO(Modulo modulo);
}
