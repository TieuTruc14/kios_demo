
app.controller('kiosCtrl',['$scope','$http','$filter' ,function ($scope,$http,$filter) {

    $scope.page=page;
    $scope.list;
    $scope.name="";

    $http.get(preUrl+"/search/service-list")
        .then(function (response) {
            if(response!=null && response!='undefined' && response.status==200){
                $scope.page=response.data;
                $scope.list=response.data;
                // $scope.page.pageCount=getPageCount($scope.page);
                // $scope.page.pageList=getPageList($scope.page);
            }
        });

    $scope.search=function () {
        $http.get(preUrl+"/search/service-list")
            .then(function (response) {
                if(response!=null && response!='undefined' && response.status==200){
                    $scope.list=response.data;
                    $scope.new = $filter('filter')($scope.list.items, {name: $scope.name});
                    $scope.page.items=$scope.new;
                }
            });
    }
    // $http.get(preUrl+"/administer/package/listAll")
    //     .then(function (response) {
    //         if(response!=null && response!='undefined' && response.status==200){
    //             $scope.listPackage=response.data;
    //             console.log($scope.listPackage);
    //         }
    //     });




    }]);