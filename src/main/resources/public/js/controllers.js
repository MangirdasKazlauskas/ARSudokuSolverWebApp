angular.module('app.controllers', []).controller('EasySudokuListController', function($scope, $state, popupService, $window, easySudoku) {
  $scope.easySudokus = easySudoku.query();
}).controller('MediumSudokuListController', function($scope, $state, popupService, $window, mediumSudoku) {
  $scope.mediumSudokus = mediumSudoku.query();
}).controller('HardSudokuListController', function($scope, $state, popupService, $window, hardSudoku) {
  $scope.hardSudokus = hardSudoku.query();
}).controller('EasySudokuViewController', function($scope, $stateParams, easySudoku) {
  $scope.sudoku = easySudoku.get({ id: $stateParams.id });
}).controller('MediumSudokuViewController', function($scope, $stateParams, mediumSudoku) {
  $scope.sudoku = mediumSudoku.get({ id: $stateParams.id });
}).controller('HardSudokuViewController', function($scope, $stateParams, hardSudoku) {
  $scope.sudoku = hardSudoku.get({ id: $stateParams.id });
});
