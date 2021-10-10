package com.curso.fiap.curso.fiap.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import com.curso.fiap.curso.fiap.model.dto.UsuarioRequestDTO;
import com.curso.fiap.curso.fiap.model.entity.Usuario;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UsuarioMapper {

  Usuario usuarioRequestDTOToUsuario(UsuarioRequestDTO dto);
}
