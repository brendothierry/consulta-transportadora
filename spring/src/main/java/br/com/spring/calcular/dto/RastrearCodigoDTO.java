package br.com.spring.calcular.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * 
 * @author Brendo Thierry
 * @since 16/01/2021
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"RastrearCodigoDTO"})
public class RastrearCodigoDTO {

	@JsonProperty("codigoRastreio")
	private Integer codigoRastreio;
	@JsonProperty("statusObjeto")
	private String statusObjeto;
	private Erro erro;

	public Erro getErro() {
		return erro;
	}

	public void setErro(Erro erro) {
		this.erro = erro;
	}

	public Integer getCodigoRastreio() {
		return codigoRastreio;
	}

	public void setCodigoRastreio(Integer codigoRastreio) {
		this.codigoRastreio = codigoRastreio;
	}

	public String getStatusObjeto() {
		return statusObjeto;
	}

	public void setStatusObjeto(String statusObjeto) {
		this.statusObjeto = statusObjeto;
	}

	@Override
	public String toString() {
		return "RastrearCodigoDTO [codigoRastreio=" + codigoRastreio + ",  statusObjeto=" + statusObjeto + ", erro=" + erro + "]";
	}

}
