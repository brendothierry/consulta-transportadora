package br.com.spring.calcular.service;

import br.com.spring.calcular.entity.RastrearCodigo;

public interface RastrearCodigoService {

	public RastrearCodigo findByCodigoRastreio(Long codigoRastreio);
}
