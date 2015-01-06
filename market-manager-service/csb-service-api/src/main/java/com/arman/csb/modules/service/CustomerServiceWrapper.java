package com.arman.csb.modules.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CustomerService}.
 *
 * @author Brian Wing Shun Chan
 * @see CustomerService
 * @generated
 */
public class CustomerServiceWrapper implements CustomerService,
    ServiceWrapper<CustomerService> {
    private CustomerService _customerService;

    public CustomerServiceWrapper(CustomerService customerService) {
        _customerService = customerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _customerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _customerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _customerService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONArray search(
        java.lang.String filter, int start, int maxResult,
        com.liferay.portal.service.ServiceContext serviceContext) {
        return _customerService.search(filter, start, maxResult, serviceContext);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject addCustomer(
        java.util.Map<java.lang.String, java.lang.Object> customer,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerService.addCustomer(customer, serviceContext);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject getTotal(
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerService.getTotal(serviceContext);
    }

    @Override
    public com.liferay.portal.kernel.json.JSONObject getById(long customerId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerService.getById(customerId, serviceContext);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CustomerService getWrappedCustomerService() {
        return _customerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCustomerService(CustomerService customerService) {
        _customerService = customerService;
    }

    @Override
    public CustomerService getWrappedService() {
        return _customerService;
    }

    @Override
    public void setWrappedService(CustomerService customerService) {
        _customerService = customerService;
    }
}