package br.com.spring.calcular.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.spring.calcular.entity.RastrearCodigo;
import br.com.spring.calcular.repository.RastrearCodigoRepository;
import br.com.spring.calcular.service.RastrearCodigoService;

/**
 * 
 * @author Brendo Thierry
 * @since 16/01/2021
 */
@Service
public class RastrearCodigoServiceImpl implements RastrearCodigoService {
     
	@Autowired
	RastrearCodigoRepository rastrearCodigoRepository;
	
	@Override
	public RastrearCodigo findByCodigoRastreio(Long codigoRastreio) {
		RastrearCodigo rastrearCodigo = rastrearCodigoRepository.findById(codigoRastreio).get();
		return rastrearCodigo;
	}
	
}
