<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<h2>Hello World!</h2>
<script src="plugins/angularjs/angular.min.js"></script>
​
<div ng-app="myApp" ng-controller="siteCtrl">
    ​
    <ul>
        <li ng-repeat="x in names">
            {{x}}
        </li>
    </ul>
    ​
</div>
​
<script>
    var app = angular.module('myApp', []);

    app.controller('siteCtrl', function($scope, $http) {
        $http.get("brand/findAll.do").then(function (response) {
            $scope.names = response});

    });
</script>
</body>
</html>
