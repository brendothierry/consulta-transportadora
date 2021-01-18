function RastrearCodigoController($scope, $http, $rootScope,
		RastrearCodigoServices) {
	$scope.alertFields = false;
	$scope.itemList = {};
	$scope.formConsultar = true;
	$scope.formRastreio = false;

	$scope.salvarDados = function(cadastro) {
		if ($scope.validandoCamposObrigatorios(cadastro)) {
			RastrearCodigoServices.create({
				codigoRastreio : cadastro.codigoRastreio,
			}, function(response) {
				cadastro.consultarCodigo = '';
				$scope.consultar();
			}, function(error) {
				alert(response);
			})
		}
	};

	$scope.validandoCamposObrigatorios = function(cadastro) {
		if (cadastro != undefined && cadastro != null && cadastro.codigoRastreio != null) {
			return true;
		} else {
			alert('Favor preencher os campos obrigatorios');
			return false;
		}
	};

	$scope.consultar = function(cadastro) {
		$scope.itemList = RastrearCodigoServices.findByCodigoRastreio({
			codigoRastreio : cadastro.codigoRastreio
		}, function(response) {
			console.log(response);
			if(response.codigoRastreio != null) {
				$scope.formConsultar = false;
				$scope.formRastreio = true;
				
				if(response.statusObjeto == 'entregue') {
					$('#myTab a[href="#entregue"]').tab('show')
				} else if(response.statusObjeto == 'em_preparacao') {
					$('#myTab a[href="#preparacao"]').tab('show')
				} else if(response.statusObjeto == 'em_andamento') {
					$('#myTab a[href="#andamento"]').tab('show')
				} else if(response.statusObjeto == 'encaminhado') {
					$('#myTab a[href="#encaminhado"]').tab('show')
				}
			}
		}, function(error) {
		})
	};
	
	$scope.initSession = function() {
		$scope.valorSession = RastrearCodigoServices.initSessionPayment({}, function(response) {
		}, function(error) {
		})
	}
}
