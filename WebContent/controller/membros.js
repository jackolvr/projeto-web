var membrosModulo = angular.module('membrosModulo',[]);

	membrosModulo.controller("membrosController", function ($scope, $http) {
	var urlMembros = 'http://localhost:8089/scmcTeste2/rest/membros';

	$scope.listarMembros = function() {
		$http.get(urlMembros).sucess(function (membros){
			$scope.membros = membros;

		}).error (function (erro){
			alert(erro);
		});
	}

	$scope.limparCampos = function () {
		$scope.membros = "";
	}	
	

	$scope.salvar = function () {
		if($scope.membros.idMembros == undefined){
			$http.post(urlMembros,$scope.membros).sucess(function (membros){
				$scope.membros.push($scope.membros);
				$scope.limparCampos();

			}).error (function (erro){
			alert(erro);
		});
		}else{
			$http.put(urlMembros,$scope.membros).sucess(function (membros){
				$scope.listarMembros();
				$scope.limparCampos();
				}).error (function (erro){
			alert(erro);
		});
		}
	}

	$scope.excluir = function(){
		if($scope.membros.idMembro == undefined){
			alert("Selecione um registro para excluir!");
		}else{
			$http.delete(urlMembros+'/'+$scope.membros.idMembro).sucess(function(){
				$scope.listarMembros();
				$scope.limparCampos();
			}).error (function (erro){
			alert(erro);
		});
		}
	}

	//executa
	$scope.listarMembros();

});