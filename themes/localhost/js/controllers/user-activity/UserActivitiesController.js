MetronicApp.controller('UserActivitiesController', ['$rootScope', '$scope', 'UserActivityService', '$state', '$modal', function ($rootScope, $scope, UserActivityService, $state, $modal) {
    $rootScope.settings.layout.pageBodySolid = true;
    $rootScope.settings.layout.pageSidebarClosed = false;

    UserActivityService.search('', '', '', '', {scope:$scope});

    if (!$scope.initialized) {
        $scope.$on('UserActivityService.search', function (event, data) {
            $scope.activities = data.result;

            angular.forEach($scope.activities, function (activity) {
                activity.data = activity.data[0];
            });
        });
    }
    ;

    $scope.doSearch = function () {
        UserActivityService.search($scope.query || '', $scope.selectedEntity || '',
            $scope.selectedAction || '', $scope.selectedImportance || '', {scope:$scope});
    };

    $scope.importances = [
        {value:1, text:'بالا', className:'label-danger'},
        {value:2, text:'متوسط', className:'label-warning'},
        {value:3, text:'پایین', className:'label-success'}
    ];

    $scope.entities = [
        {value:'Invoice', text:'فاکتور'},
        {value:'InvoiceItem', text:'اقلام فاکتور'},
        {value:'Customer', text:'مشتری'},
        {value:'Score', text:'امتیاز'},
        {value:'User', text:'کاربران'},
        {value:'Payment', text:'پرداخت'}
    ];

    $scope.actions = [
        {value:1, text:'افزودن'},
        {value:2, text:'ویرایش'},
        {value:3, text:'حذف'},
        {value:4, text:'تغییر وضعیت'}
    ];

    $scope.getName = function (input, data, param) {
        var result = 'none';

        angular.forEach(data, function (object) {
            if (object.value == input) {
                result = object[param];
            }
        });

        return result;
    };

    $scope.showImportance = function (input) {
        return $scope.getName(input, $scope.importances, 'text');
    };

    $scope.showImportanceClass = function (input) {
        return $scope.getName(input, $scope.importances, 'className');
    };

    $scope.showEntity = function (input) {
        return $scope.getName(input, $scope.entities, 'text');
    };

    $scope.showAction = function (input) {
        return $scope.getName(input, $scope.actions, 'text');
    };

    $scope.getLinkURL = function (entity, data) {
        if (entity == "Invoice") {
            return "invoice/" + data.id;
        }

        if (entity == "InvoiceItem") {
            return "invoice/" + data.invoiceId;
        }


        if (entity == "Customer") {
            return "customer/" + data.id;
        }

        if (entity == "User") {
            return "userDetails/" + data.invoiceId;
        }

        if (entity == "Score") {
            return "customer/" + data.customerId;
        }

    }

    $scope.getExplain = function (entity, data, action) {
        if (entity == "InvoiceItem") {
            return "نام جنس: " + data.productName
                + " - کد جنس: " + data.productCode
                + " - قیمت پایه: " + data.basePrice
                + " - تعداد: " + data.number;
        }

        if (entity == "Invoice") {
            return "اطلاعات تا لحظه ثبت: "
                + "تعداد اقلام : " + data.itemNumber
                + " - جمع کل هزینه: " + data.totalCost
                + " - مشتری : " + data.customerName;
            ;
        }

        if (entity == "Customer") {
            if (action == 1) {
                return 'مشتری با نام  '
                    + '<strong>'
                    + data.firstName + ' ' + data.lastName
                    + '</strong>'
                    + ' به سامانه افزوده شد.'
                    ;
            } else if (action == 4) {
                return 'وضعیت مشتری با نام  '
                    + '<strong>'
                    + data.firstName + ' ' + data.lastName
                    + '</strong>'
                    + ' به '
                    + ' <span class=\"label font-' + ((data.isActive) ? 'green-jungle' : 'red-flamingo') + '\"> '
                    + ((data.isActive) ? ' فعال' : 'غیر فعال')
                    + '</span>'
                    + '  تغییر یافت'
                    ;
            }
        }

        if (entity == "Score") {
            return   '<strong>' + data.amount + '</strong>'
                +' امتیاز به مشتری با نام '
                + '<strong>'
                + data.firstName + ' ' + data.lastName
                + '</strong>'
                + ' تخصیص یافت. ';
        }
    }

    $scope.initialized = true;
}]);