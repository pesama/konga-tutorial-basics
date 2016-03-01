'use strict';

angular
  .module('uiApp', [
    'ngAnimate',
    'ngCookies',
    'ngResource',
    'ngRoute',
    'ngSanitize',
    'ngTouch',
    'konga'
  ])
  .config(function ($routeProvider) {
    $routeProvider
      .when('/', {
        templateUrl: 'views/main.html',
        controller: 'MainCtrl',
        controllerAs: 'main'
      })
      .when('/about', {
        templateUrl: 'views/about.html',
        controller: 'AboutCtrl',
        controllerAs: 'about'
      })
      .otherwise({
        redirectTo: '/'
      });
  })
  .run(['metadata', 'util', 'common', '$rootScope', function(metadata, util, common, $rootScope) {
    common.store('metadata', metadata);
    util.init(metadata);
    $rootScope.metadata = metadata;
  }])
  .run(['userData', function(userData) {

    // We want to edit 'app key'
    userData.roles.push('app-admin');

    // We want to create and manage 'orgs'
    userData.roles.push('org-admin');
  }]);
