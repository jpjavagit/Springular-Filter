<%@ page language="java" contentType="text/html; charset=UTF-8;application/x-www-form-urlencoded"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html ng-app="app">
<head>
		<style>
			.mbottom {
				margin-bottom: 10px;
			}
			.mtop{
				margin-top: 20px;
			}
			
			.mleft{
				margin-left: 295px;
			}
		</style>
		
<link rel="stylesheet" href="http://getbootstrap.com/dist/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.1/angular.min.js"></script>
<script src="https://code.angularjs.org/1.4.4/angular-resource.min.js"></script>

<script type="text/javascript">
	
	var app = angular.module('app', ['ngResource']);
	
	app.controller("spring-controller", function($scope, $http, $resource){
		$scope.filter = "";
 		$scope.getPersons = function(){
			var res = $resource('/spring/getPersons');
			$scope.persons = res.query(function(){});
		};
	});
	
	
</script>


<title>SprinGular</title>
	
</head>
<body>
	<div class="container mtop" ng-controller="spring-controller">
		<form>
			<div class="row mbottom">
				<div class="col-sm-3 text-right">
					<label for="description">Filter:</label>
				</div>
				<div class="col-sm-6">
					<input type="text" ng-model="filter" name="filter" class="form-control" id="filter">
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 mleft">
					<div class="panel panel-default">
						<div class="panel-heading">List of Names</div>
							<table class="table">
								<tr>
									<th>Name</th>
									<th>Age</th>
								</tr>
								<tr ng-repeat="person in persons | filter : filter">
									<td>{{person.name}}</td>
									<td>{{person.age}}</td>				
								</tr>
							</table>
					</div>
				</div>
			</div>
			<div class="row mbottom">
				<div class="col-sm-2 mleft">
					<button type="submit" ng-click="getPersons()" class="btn btn-success">Search</button>
				</div>
			</div>
			
		</form>
	</div>
</body>
</html>