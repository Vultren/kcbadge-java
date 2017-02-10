'use strict';

angular.
module('teitokuInfo').
component('teitokuInfo', {
	templateUrl: 'js/general/general.template.html',
	controller: function InfoController($scope, $http) {
		var baseUrl = "";
		var servers = {};
		var selectedServer;
		getAllServers();
		
		
		function getAllServers() {
			$http.get(baseUrl + "/servers").
			then (function(response) {
	            $scope.servers = response.data;
	        });
		}
		
	}
})