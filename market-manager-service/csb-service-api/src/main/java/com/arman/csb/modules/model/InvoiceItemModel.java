package com.arman.csb.modules.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the InvoiceItem service. Represents a row in the &quot;CSBModules_InvoiceItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arman.csb.modules.model.impl.InvoiceItemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arman.csb.modules.model.impl.InvoiceItemImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InvoiceItem
 * @see com.arman.csb.modules.model.impl.InvoiceItemImpl
 * @see com.arman.csb.modules.model.impl.InvoiceItemModelImpl
 * @generated
 */
public interface InvoiceItemModel extends BaseModel<InvoiceItem> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a invoice item model instance should use the {@link InvoiceItem} interface instead.
     */

    /**
     * Returns the primary key of this invoice item.
     *
     * @return the primary key of this invoice item
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this invoice item.
     *
     * @param primaryKey the primary key of this invoice item
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this invoice item.
     *
     * @return the uuid of this invoice item
     */
    @AutoEscape
    public String getUuid();

    /**
     * Sets the uuid of this invoice item.
     *
     * @param uuid the uuid of this invoice item
     */
    public void setUuid(String uuid);

    /**
     * Returns the ID of this invoice item.
     *
     * @return the ID of this invoice item
     */
    public long getId();

    /**
     * Sets the ID of this invoice item.
     *
     * @param id the ID of this invoice item
     */
    public void setId(long id);

    /**
     * Returns the create date of this invoice item.
     *
     * @return the create date of this invoice item
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this invoice item.
     *
     * @param createDate the create date of this invoice item
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this invoice item.
     *
     * @return the modified date of this invoice item
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this invoice item.
     *
     * @param modifiedDate the modified date of this invoice item
     */
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the invoice ID of this invoice item.
     *
     * @return the invoice ID of this invoice item
     */
    public long getInvoiceId();

    /**
     * Sets the invoice ID of this invoice item.
     *
     * @param invoiceId the invoice ID of this invoice item
     */
    public void setInvoiceId(long invoiceId);

    /**
     * Returns the product ID of this invoice item.
     *
     * @return the product ID of this invoice item
     */
    public long getProductId();

    /**
     * Sets the product ID of this invoice item.
     *
     * @param productId the product ID of this invoice item
     */
    public void setProductId(long productId);

    /**
     * Returns the number of this invoice item.
     *
     * @return the number of this invoice item
     */
    public Short getNumber();

    /**
     * Sets the number of this invoice item.
     *
     * @param number the number of this invoice item
     */
    public void setNumber(Short number);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(InvoiceItem invoiceItem);

    @Override
    public int hashCode();

    @Override
    public CacheModel<InvoiceItem> toCacheModel();

    @Override
    public InvoiceItem toEscapedModel();

    @Override
    public InvoiceItem toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
