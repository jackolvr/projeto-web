var igrejaModulo = angular.module('igrejaModulo',[]);

	igrejaModulo.controller("igrejaController", function ($scope, $http) {
	urlIgreja= 'http://localhost:8089/scmcTeste2/rest/igreja';

	$scope.listarIgreja = function() {
		$http.get(urlIgreja).sucess(function (igreja){
			$scope.igreja = igreja;

		}).error (function (erro){
			alert(erro);
		});
	}

	$scope.limparCampos = function () {
		$scope.igreja = "";
	}	
	

	$scope.salvar = function () {
		if($scope.igreja.codigo == undefined){
			$http.post(urlIgreja,$scope.igreja).sucess(function (igreja){
				$scope.igreja.push($scope.igreja);
				$scope.limparCampos();

			}).error (function (erro){
			alert(erro);
		});
		}else{
			$http.put(urlIgreja,$scope.igreja).sucess(function (igreja){
				$scope.listarIgreja();
				$scope.limparCampos();
				}).error (function (erro){
			alert(erro);
		});
		}
	}

	$scope.excluir = function(){
		if($scope.igreja.codigo == undefined){
			alert("Selecione um registro para excluir!");
		}else{
			$http.delete(urlIgreja+'/'+$scope.igreja.codigo).sucess(function(){
				$scope.listarIgreja();
				$scope.limparCampos();
			}).error (function (erro){
			alert(erro);
		});
		}
	}

	//executa
	$scope.listarIgreja();

});