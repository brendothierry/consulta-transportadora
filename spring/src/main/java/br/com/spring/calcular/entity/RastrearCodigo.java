package br.com.spring.calcular.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TB_RASTREAMENTO")
public class RastrearCodigo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoRastreio;
	private String statusObjeto;
	
	public Long getCodigoRastreio() {
		return codigoRastreio;
	}
	public void setCodigoRastreio(Long codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}
	public String getStatusObjeto() {
		return statusObjeto;
	}
	public void setStatusObjeto(String statusObjeto) {
		this.statusObjeto = statusObjeto;
	}

	
}
