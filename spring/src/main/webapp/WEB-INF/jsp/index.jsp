<html>
<head>
<title>Formulário de Cadastro</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body ng-app="RastrearCodigoApp" ng-controller="RastrearCodigoController">
	<div class="container">
     	<caption>Formulário Transportadora</caption>
		
		<form ng-show="formConsultar">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="nomeCliente" class="labelInput">Código de rastreio*</label> <input
						type="text" class="form-control" id="codigoRastreio"
						ng-model="cadastro.codigoRastreio" placeholder="Digite o código">
						<br>
					<button type="button" class="btn btn-primary" ng-click="consultar(cadastro)">
					  Consultar
					</button>
				</div>
			</div>
		</form>
		<form ng-show="formRastreio">
			<ul class="nav nav-tabs" id="myTab" role="tablist">
			  <li class="nav-item">
			    <a class="nav-link active" id="encaminhado-tab" data-toggle="tab" href="#home" role="tab" aria-controls="encaminhado" aria-selected="true">Encaminhado</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" id="postado-tab" data-toggle="tab" href="#postado" role="tab" aria-controls="postado" aria-selected="false">postado</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" id="andamento-tab" data-toggle="tab" href="#andamento" role="tab" aria-controls="andamento" aria-selected="false">Em andamento</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" id="entregue-tab" data-toggle="tab" href="#entregue" role="tab" aria-controls="entregue" aria-selected="false">Entregue</a>
			  </li>
			</ul>
			<div class="tab-content" id="myTabContent">
			  <div class="tab-pane fade" id="preparacao" role="tabpanel" aria-labelledby="preparacao-tab">Objeto em Preparação</div>
			  <div class="tab-pane fade show active" id="encaminhado" role="tabpanel" aria-labelledby="encaminhado-tab">Objeto Encaminhado</div>
			  <div class="tab-pane fade" id="andamento" role="tabpanel" aria-labelledby="andamento-tab">Objeto Em Andamento</div>
			  <div class="tab-pane fade" id="entregue" role="tabpanel" aria-labelledby="entregue-tab">Objeto Entregue</div>
			</div>
		</form>
		<script src="/angular/angular.js"></script>
		<script src="/angular/angular-resource.js"></script>
		<script src="/js/modules/RastrearCodigoApp.js"></script>
		<script src="/js/services/RastrearCodigoServices.js"></script>
		<script src="/js/controllers/RastrearCodigoController.js"></script>
		<script src="/css/jquery-1.9.1.js"></script>
		<script src="/css/bootstrap.js"></script>
	</div>
</body>
</html>
