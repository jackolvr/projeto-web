var igrejaModulo = angular.module('igrejaModulo',[]);

igrejaModulo.controller("igrejaController", function ($scope, $http) {
	$http.get('controller/igrejajson.json').then(function (response) {
		$scope.igreja = response.data.igreja;
	})
	
	$scope.limparCampos = function () {
		$scope.igreja = "";
	}

	$scope.salvar = function () {
		$scope.igreja.push($scope.igreja);
		$scope.limparCampos();
	}


});