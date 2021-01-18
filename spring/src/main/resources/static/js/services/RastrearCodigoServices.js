var modulo = angular.module('RastrearCodigoServices', [ 'ngResource' ]);

modulo.factory('RastrearCodigoServices', [ '$resource', function($resource) {

	return $resource('/rest/:action/:id', {}, {
		  findByCodigoRastreio :{
			     isArray: false,
				 method: 'GET',
			     params: {action: 'findByCodigoRastreio'}
		  },
		  create :{
			     isArray: false,
				 method: 'POST',
			     params: {action: 'create'}
		  }
	});
} ]);
