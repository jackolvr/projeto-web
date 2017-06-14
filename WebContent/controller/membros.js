var membrosModulo = angular.module('membrosModulo',[]);

membrosModulo.controller("membrosController", function ($scope, $http) {
	$http.get('controller/membrosjson.json').then(function (response) {
		$scope.membros = response.data.membros;
	})
	
	$scope.limparCampos = function () {
		$scope.membros = "";
	}

	$scope.salvar = function () {
		$scope.membros.push($scope.membros);
		$scope.limparCampos();
	}


});