//品牌服务层
app.service('brandService',function($http){
    //读取列表数据绑定到表单中
    this.findAll=function(){
        return $http.get('../brand/findAll.do');
    }

    this.findPage=function (page,rows) {
      return   $http.get('../brand/findPage.do?page='+page+'&rows='+rows);
    }

    this.findOne=function(id){
       return   $http.get('../brand/findOne.do?id='+id);

    }
});