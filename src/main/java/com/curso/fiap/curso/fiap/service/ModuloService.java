package com.curso.fiap.curso.fiap.service;

import java.util.List;
import java.util.Optional;

import com.curso.fiap.curso.fiap.entity.Modulo;
import com.curso.fiap.curso.fiap.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ModuloService {

	@Autowired
	private ModuloRepository moduloRepository;

	public Modulo create(Modulo modulo) {
		return moduloRepository.save(modulo);
	}

	public Modulo update(Modulo modulo) {
		if (!moduloRepository.existsById(modulo.getId())) {
			throw new RuntimeException("Módulo não encontrado");
		}
		
		return moduloRepository.save(modulo);
	}

	public void delete(Long id) {
		if (!moduloRepository.existsById(id)) {
			throw new RuntimeException("Módulo não encontrado");
		}
		
		moduloRepository.deleteById(id);
	}

	public Modulo find(Long id) {
		Optional<Modulo> optional = moduloRepository.findById(id);
		
		if (!optional.isPresent()) {
			throw new RuntimeException("Módulo não encontrado");
		}
		
		return optional.get();
	}
	
	public List<Modulo> findAllByCursoId(Long id){
		return moduloRepository.findAllByCursoId(id);
	}
}
