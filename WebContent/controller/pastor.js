var pastorModulo = angular.module('pastorModulo',[]);

pastorModulo.controller("pastorController", function ($scope, $http) {
	$http.get('controller/pastorjson.json').then(function (response) {
		$scope.pastor = response.data.pastor;
	})
	
	$scope.limparCampos = function () {
		$scope.pastor = "";
	}

	$scope.salvar = function () {
		$scope.pastor.push($scope.pastor);
		$scope.limparCampos();
	}


});