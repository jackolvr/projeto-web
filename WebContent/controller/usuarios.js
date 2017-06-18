var usuariosModulo = angular.module('usuariosModulo',[]);

	usuariosModulo.controller("usuariosController", function ($scope, $http) {
	urlUsuarios= 'http://localhost:8089/rest/usuarios';

	$scope.listarUsuarios = function() {
		$http.get(urlUsuarios).sucess(function (usuarios){
			$scope.usuarios = usuarios;

		}).error (function (erro){
			alert(erro);
		});
	}

	$scope.limparCampos = function () {
		$scope.usuarios = "";
	}	
	

	$scope.salvar = function () {
		if($scope.usuarios.codigo == undefined){
			$http.post(urlUsuarios,$scope.usuarios).sucess(function (usuarios){
				$scope.usuarios.push($scope.usuarios);
				$scope.limparCampos();

			}).error (function (erro){
			alert(erro);
		});
		}else{
			$http.put(urlUsuarios,$scope.usuarios).sucess(function (usuarios){
				$scope.listarUsuarios();
				$scope.limparCampos();
				}).error (function (erro){
			alert(erro);
		});
		}
	}

	$scope.excluir = function(){
		if($scope.usuarios.codigo == undefined){
			alert("Selecione um registro para excluir!");
		}else{
			$http.delete(urlUsuarios+'/'+$scope.usuarios.codigo).sucess(function(){
				$scope.listarUsuarios();
				$scope.limparCampos();
			}).error (function (erro){
			alert(erro);
		});
		}
	}

	//executa
	$scope.listarUsuarios();

});