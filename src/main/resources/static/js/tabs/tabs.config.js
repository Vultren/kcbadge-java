'use strict';

angular.
  module('kantaiTabs').
  config(function($locationProvider, $stateProvider, $urlRouterProvider) {
	    
	    $locationProvider.html5Mode(true);
	    $stateProvider
	    .state('general', {
	    	template: '<teitoku-info></teitoku-info>'
	    })
	    .state('shipFleet', {
	    	template: '<ship-fleet></ship-fleet>'
	    })
	    .state('shipFleet.kanmusu', {
	    	templateUrl: 'js/fleet/partial-kanmusu.template.html'
	    })
	    .state('shipFleet.abyssal', {
	    	templateUrl: 'js/fleet/partial-abyssal.template.html'
	    })
	    .state('kaini', {
	    	template: '<kai-ni></kai-ni>'
	    })
	    .state('poster', {
	    	template: '<ship-collection></ship-collection>'
	    })
	    .state('furniture', {
	    	template: '<furniture></furniture>'
	    })
  	}
  );
