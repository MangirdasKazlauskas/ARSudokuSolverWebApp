angular.module('app.services', []).factory('easySudoku', function($resource) {
  return $resource('/api/v1/easySudokus/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).factory('mediumSudoku', function($resource) {
    return $resource('/api/v1/mediumSudokus/:id', { id: '@id' }, {
        update: {
            method: 'PUT'
        }
    });
}).factory('hardSudoku', function($resource) {
    return $resource('/api/v1/hardSudokus/:id', { id: '@id' }, {
        update: {
            method: 'PUT'
        }
    });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
});
