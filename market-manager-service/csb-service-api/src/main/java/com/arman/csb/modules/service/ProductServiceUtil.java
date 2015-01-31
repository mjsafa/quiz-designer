package com.arman.csb.modules.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Product. This utility wraps
 * {@link com.arman.csb.modules.service.impl.ProductServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ProductService
 * @see com.arman.csb.modules.service.base.ProductServiceBaseImpl
 * @see com.arman.csb.modules.service.impl.ProductServiceImpl
 * @generated
 */
public class ProductServiceUtil {
    private static ProductService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.arman.csb.modules.service.impl.ProductServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.liferay.portal.kernel.json.JSONObject addProduct(
        java.util.Map<java.lang.String, java.lang.Object> product,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addProduct(product, serviceContext);
    }

    public static com.liferay.portal.kernel.json.JSONObject updateProduct(
        java.util.Map<java.lang.String, java.lang.Object> product,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().updateProduct(product, serviceContext);
    }

    public static com.liferay.portal.kernel.json.JSONArray search(
        java.lang.String filter, int start, int maxResult,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.json.JSONException {
        return getService().search(filter, start, maxResult, serviceContext);
    }

    public static com.liferay.portal.kernel.json.JSONObject getById(
        long productId, com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getById(productId, serviceContext);
    }

    public static void clearService() {
        _service = null;
    }

    public static ProductService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ProductService.class.getName());

            if (invokableService instanceof ProductService) {
                _service = (ProductService) invokableService;
            } else {
                _service = new ProductServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(ProductServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ProductService service) {
    }
}