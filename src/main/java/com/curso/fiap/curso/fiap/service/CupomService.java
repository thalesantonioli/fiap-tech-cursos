package com.curso.fiap.curso.fiap.service;

import java.util.List;
import java.util.Optional;

import com.curso.fiap.curso.fiap.entity.Cupom;
import com.curso.fiap.curso.fiap.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CupomService {

	@Autowired
	private CupomRepository cupomRepository;
	
	public Cupom create(Cupom cupom) {
		return cupomRepository.save(cupom);
	}
	
	public Cupom update(Cupom cupom) {
		if (!cupomRepository.existsById(cupom.getId())) {
			throw new RuntimeException("Cupom não encontrado");
		}
		
		return cupomRepository.save(cupom);
	}
	
	public void delete(Long id) {
		if (!cupomRepository.existsById(id)) {
			throw new RuntimeException("Cupom não encontrado");
		}
		
		cupomRepository.deleteById(id);
	}
	
	public Cupom find(Long id) {
		Optional<Cupom> optional = cupomRepository.findById(id);
		
		if (!optional.isPresent()) {
			throw new RuntimeException("Cupom não encontrado");
		}
		
		return optional.get();
	}
	
	public List<Cupom> findAll() {
		return cupomRepository.findAll();
	}
}
