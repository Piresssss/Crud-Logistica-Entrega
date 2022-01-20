package com.rpiress.domain.service;

import org.springframework.stereotype.Service;

import com.rpiress.domain.exception.EntidadeNaoEncontradaException;
import com.rpiress.domain.model.Entrega;
import com.rpiress.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId).orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
		
	}

}
