package br.com.spring.calcular.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.calcular.entity.RastrearCodigo;

@Repository
public interface RastrearCodigoRepository extends CrudRepository<RastrearCodigo, Long> {

}
