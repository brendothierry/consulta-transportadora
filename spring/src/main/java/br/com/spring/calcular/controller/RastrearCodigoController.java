package br.com.spring.calcular.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.spring.calcular.entity.RastrearCodigo;
import br.com.spring.calcular.service.RastrearCodigoService;

/**
 * 
 * @author Brendo Thierry
 * @since 16/01/2021
 */
@Controller
@RequestMapping("/rest")
public class RastrearCodigoController {

	private static final Logger log = LoggerFactory.getLogger(RastrearCodigoController.class);
	
	@Autowired
	RastrearCodigoService rastrearCodigoService;
	
	@RequestMapping(value = "/findByCodigoRastreio", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<RastrearCodigo> findByCodigoRastreio(@RequestParam Long codigoRastreio) {
		log.info("Iniciando consulta no metodo findByCodigoRastreio");
		RastrearCodigo rastrearCodigo = rastrearCodigoService.findByCodigoRastreio(codigoRastreio);
		return new ResponseEntity<RastrearCodigo>(rastrearCodigo, HttpStatus.OK);
    }
}
