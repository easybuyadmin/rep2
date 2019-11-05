   //品牌控制层
    app.controller('brandController' ,function($scope,$controller,brandService){
        $controller('baseController',{$scope:$scope});//继承
        //读取列表数据绑定到表单中
        $scope.findAll=function(){
            brandService.findAll().success(
                function(response){
                    $scope.list=response;
                }
            );
        }

        $scope.findPage=function (page,rows) {
            brandService.findPage(page,rows).success(
                function (response) {
                    $scope.list=response.rows;
                    $scope.paginationConf.totalItems=response.total;//更新总记录数
                }
            )
        }


        $scope.findOne=function (id) {
            brandService.findOne(id).success(
                function(response){
                    $scope.entity= response;
                }
            )
        }





});
