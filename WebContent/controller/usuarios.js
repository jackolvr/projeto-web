var usuariosModulo = angular.module('usuariosModulo',[]);

usuariosModulo.controller("usuariosController", function ($scope, $http) {
	$http.get('controller/usuariosjson.json').then(function (response) {
		$scope.usuarios = response.data.usuarios;
	})
	
	$scope.limparCampos = function () {
		$scope.usuarios = "";
	}

	$scope.salvar = function () {
		$scope.usuarios.push($scope.usuarios);
		$scope.limparCampos();
	}


});