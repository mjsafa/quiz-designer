MetronicApp.factory("InvoiceService", function (JsonServer) {
   return {
       search:function (filter, text, status, customerId, options) {
           var _filter = angular.copy(filter, _filter);
           if(_filter){
               if(_filter.fromDate){
                   _filter.fromDate = _filter.fromDate.getTime();
               } else {
                   _filter.fromDate = null;
               }

               if(_filter.toDate){
                   _filter.toDate = _filter.toDate.getTime();
               } else {
                   _filter.toDate = null;
               }
           }

           var result = JsonServer.postByUrl('/csb-modules-service-portlet.invoice', 'search', {
               text:text, status:status, customerId:customerId,
               fromDate:_filter.fromDate, toDate:_filter.toDate, start:_filter.first, maxResult:_filter.maxResults,
               serviceContext:{scopeGroupId:scopeGroupId}}, {
               eventName:'InvoiceService.search',
               scope:options ? options.scope : undefined
           });
       },
       addInvoice:function (invoice, options) {
           var result = JsonServer.postByUrl('/csb-modules-service-portlet.invoice', 'add-invoice', {invoice:JSON.stringify(invoice), serviceContext:{scopeGroupId:scopeGroupId}}, {
               eventName:'InvoiceService.addInvoice',
               scope:options ? options.scope : undefined
           });
       },
       getById:function (invoiceId, options) {
           var result = JsonServer.postByUrl('/csb-modules-service-portlet.invoice', 'get-by-id', {invoiceId:invoiceId, serviceContext:{scopeGroupId:scopeGroupId}}, {
               eventName:'InvoiceService.getById',
               scope:options ? options.scope : undefined
           });
       },
       updateInvoice:function (invoice, options) {
           var result = JsonServer.postByUrl('/csb-modules-service-portlet.invoice', 'update-invoice', {invoice:JSON.stringify(invoice), serviceContext:{scopeGroupId:scopeGroupId}}, {
               eventName:'InvoiceService.updateInvoice',
               scope:options ? options.scope : undefined
           });
       },
       updateInvoiceStatus:function (invoiceId, status, options) {
           var result = JsonServer.postByUrl('/csb-modules-service-portlet.invoice', 'update-invoice-status', {invoiceId:invoiceId, status:status, serviceContext:{scopeGroupId:scopeGroupId}}, {
               eventName:'InvoiceService.updateInvoiceStatus',
               scope:options ? options.scope : undefined
           });
       },

       ////////// Invoice Item Services ////////////////////
       ////////// Invoice Item Services ////////////////////

       searchItems:function (filter, invoiceId, options) {
           var result = JsonServer.postByUrl('/csb-modules-service-portlet.invoiceitem', 'search', {filter:filter, invoiceId:invoiceId, start:0, maxResult:30, serviceContext:{scopeGroupId:scopeGroupId}}, {
               eventName:'InvoiceItemService.search',
               scope:options ? options.scope : undefined
           });
       },
       addInvoiceItem:function (item, options) {
           var result = JsonServer.postByUrl('/csb-modules-service-portlet.invoiceitem', 'add-invoice-item', {invoiceItem:JSON.stringify(item), serviceContext:{scopeGroupId:scopeGroupId}}, {
               eventName:'InvoiceService.addInvoiceItem',
               scope:options ? options.scope : undefined
           });
       },
       deleteInvoiceItem:function (invoiceItemId, options) {
           var result = JsonServer.postByUrl('/csb-modules-service-portlet.invoiceitem', 'delete-invoice-item', {invoiceItemId:JSON.stringify(invoiceItemId), serviceContext:{scopeGroupId:scopeGroupId}}, {
               eventName:'InvoiceService.deleteInvoiceItem',
               scope:options ? options.scope : undefined
           });
       }


   }
});