angular.module('navController', [])
	.controller('nav', function($scope, $state) {
		$scope.title = 'AR Sudoku Solver Web App';

		// returns true if the current router url matches the passed in url
		// so views can set 'active' on links easily
		$scope.isUrl = function(url) {
			if (url === '#') return false;
			return ('#' + $state.$current.url.source + '/').indexOf(url + '/') === 0;
		};

		$scope.pages = [
			{
				name: 'Home',
				url: '#/'
			},
			{
				name: 'Easy Sudokus',
				url: '#/easySudokus'
			},
			{
				name: 'Medium Sudokus',
				url: '#/mediumSudokus'
			},
			{
				name: 'Hard Sudokus',
				url: '#/hardSudokus'
			}
		]
	});
