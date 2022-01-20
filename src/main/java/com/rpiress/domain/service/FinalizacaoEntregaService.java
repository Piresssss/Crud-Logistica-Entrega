package com.rpiress.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rpiress.domain.model.Entrega;
import com.rpiress.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {
	
	private BuscaEntregaService buscaEntregaService;
	private EntregaRepository entregaRepository;
	
	@Transactional
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
	
		entrega.finalizar();
		
		entregaRepository.save(entrega);
	}

}
