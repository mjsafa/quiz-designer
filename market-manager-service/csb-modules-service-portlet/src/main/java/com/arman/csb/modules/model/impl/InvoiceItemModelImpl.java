package com.arman.csb.modules.model.impl;

import com.arman.csb.modules.model.InvoiceItem;
import com.arman.csb.modules.model.InvoiceItemModel;
import com.arman.csb.modules.model.InvoiceItemSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the InvoiceItem service. Represents a row in the &quot;CSBModules_InvoiceItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arman.csb.modules.model.InvoiceItemModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InvoiceItemImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see InvoiceItemImpl
 * @see com.arman.csb.modules.model.InvoiceItem
 * @see com.arman.csb.modules.model.InvoiceItemModel
 * @generated
 */
@JSON(strict = true)
public class InvoiceItemModelImpl extends BaseModelImpl<InvoiceItem>
    implements InvoiceItemModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a invoice item model instance should use the {@link com.arman.csb.modules.model.InvoiceItem} interface instead.
     */
    public static final String TABLE_NAME = "CSBModules_InvoiceItem";
    public static final Object[][] TABLE_COLUMNS = {
            { "uuid_", Types.VARCHAR },
            { "id_", Types.BIGINT },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "invoiceId", Types.BIGINT },
            { "productCode", Types.VARCHAR },
            { "productName", Types.VARCHAR },
            { "number_", Types.INTEGER },
            { "basePrice", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table CSBModules_InvoiceItem (uuid_ VARCHAR(75) null,id_ LONG not null primary key,createDate DATE null,modifiedDate DATE null,invoiceId LONG,productCode VARCHAR(75) null,productName VARCHAR(75) null,number_ INTEGER,basePrice LONG)";
    public static final String TABLE_SQL_DROP = "drop table CSBModules_InvoiceItem";
    public static final String ORDER_BY_JPQL = " ORDER BY invoiceItem.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY CSBModules_InvoiceItem.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arman.csb.modules.model.InvoiceItem"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arman.csb.modules.model.InvoiceItem"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arman.csb.modules.model.InvoiceItem"),
            true);
    public static long INVOICEID_COLUMN_BITMASK = 1L;
    public static long UUID_COLUMN_BITMASK = 2L;
    public static long ID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arman.csb.modules.model.InvoiceItem"));
    private static ClassLoader _classLoader = InvoiceItem.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            InvoiceItem.class
        };
    private String _uuid;
    private String _originalUuid;
    private long _id;
    private Date _createDate;
    private Date _modifiedDate;
    private long _invoiceId;
    private long _originalInvoiceId;
    private boolean _setOriginalInvoiceId;
    private String _productCode;
    private String _productName;
    private Short _number;
    private long _basePrice;
    private long _columnBitmask;
    private InvoiceItem _escapedModel;

    public InvoiceItemModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static InvoiceItem toModel(InvoiceItemSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        InvoiceItem model = new InvoiceItemImpl();

        model.setUuid(soapModel.getUuid());
        model.setId(soapModel.getId());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setInvoiceId(soapModel.getInvoiceId());
        model.setProductCode(soapModel.getProductCode());
        model.setProductName(soapModel.getProductName());
        model.setNumber(soapModel.getNumber());
        model.setBasePrice(soapModel.getBasePrice());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<InvoiceItem> toModels(InvoiceItemSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<InvoiceItem> models = new ArrayList<InvoiceItem>(soapModels.length);

        for (InvoiceItemSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return InvoiceItem.class;
    }

    @Override
    public String getModelClassName() {
        return InvoiceItem.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("id", getId());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("invoiceId", getInvoiceId());
        attributes.put("productCode", getProductCode());
        attributes.put("productName", getProductName());
        attributes.put("number", getNumber());
        attributes.put("basePrice", getBasePrice());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long invoiceId = (Long) attributes.get("invoiceId");

        if (invoiceId != null) {
            setInvoiceId(invoiceId);
        }

        String productCode = (String) attributes.get("productCode");

        if (productCode != null) {
            setProductCode(productCode);
        }

        String productName = (String) attributes.get("productName");

        if (productName != null) {
            setProductName(productName);
        }

        Short number = (Short) attributes.get("number");

        if (number != null) {
            setNumber(number);
        }

        Long basePrice = (Long) attributes.get("basePrice");

        if (basePrice != null) {
            setBasePrice(basePrice);
        }
    }

    @JSON
    @Override
    public String getUuid() {
        if (_uuid == null) {
            return StringPool.BLANK;
        } else {
            return _uuid;
        }
    }

    @Override
    public void setUuid(String uuid) {
        if (_originalUuid == null) {
            _originalUuid = _uuid;
        }

        _uuid = uuid;
    }

    public String getOriginalUuid() {
        return GetterUtil.getString(_originalUuid);
    }

    @JSON
    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public long getInvoiceId() {
        return _invoiceId;
    }

    @Override
    public void setInvoiceId(long invoiceId) {
        _columnBitmask |= INVOICEID_COLUMN_BITMASK;

        if (!_setOriginalInvoiceId) {
            _setOriginalInvoiceId = true;

            _originalInvoiceId = _invoiceId;
        }

        _invoiceId = invoiceId;
    }

    public long getOriginalInvoiceId() {
        return _originalInvoiceId;
    }

    @JSON
    @Override
    public String getProductCode() {
        if (_productCode == null) {
            return StringPool.BLANK;
        } else {
            return _productCode;
        }
    }

    @Override
    public void setProductCode(String productCode) {
        _productCode = productCode;
    }

    @JSON
    @Override
    public String getProductName() {
        if (_productName == null) {
            return StringPool.BLANK;
        } else {
            return _productName;
        }
    }

    @Override
    public void setProductName(String productName) {
        _productName = productName;
    }

    @JSON
    @Override
    public Short getNumber() {
        return _number;
    }

    @Override
    public void setNumber(Short number) {
        _number = number;
    }

    @JSON
    @Override
    public long getBasePrice() {
        return _basePrice;
    }

    @Override
    public void setBasePrice(long basePrice) {
        _basePrice = basePrice;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            InvoiceItem.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public InvoiceItem toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (InvoiceItem) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        InvoiceItemImpl invoiceItemImpl = new InvoiceItemImpl();

        invoiceItemImpl.setUuid(getUuid());
        invoiceItemImpl.setId(getId());
        invoiceItemImpl.setCreateDate(getCreateDate());
        invoiceItemImpl.setModifiedDate(getModifiedDate());
        invoiceItemImpl.setInvoiceId(getInvoiceId());
        invoiceItemImpl.setProductCode(getProductCode());
        invoiceItemImpl.setProductName(getProductName());
        invoiceItemImpl.setNumber(getNumber());
        invoiceItemImpl.setBasePrice(getBasePrice());

        invoiceItemImpl.resetOriginalValues();

        return invoiceItemImpl;
    }

    @Override
    public int compareTo(InvoiceItem invoiceItem) {
        long primaryKey = invoiceItem.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof InvoiceItem)) {
            return false;
        }

        InvoiceItem invoiceItem = (InvoiceItem) obj;

        long primaryKey = invoiceItem.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        InvoiceItemModelImpl invoiceItemModelImpl = this;

        invoiceItemModelImpl._originalUuid = invoiceItemModelImpl._uuid;

        invoiceItemModelImpl._originalInvoiceId = invoiceItemModelImpl._invoiceId;

        invoiceItemModelImpl._setOriginalInvoiceId = false;

        invoiceItemModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<InvoiceItem> toCacheModel() {
        InvoiceItemCacheModel invoiceItemCacheModel = new InvoiceItemCacheModel();

        invoiceItemCacheModel.uuid = getUuid();

        String uuid = invoiceItemCacheModel.uuid;

        if ((uuid != null) && (uuid.length() == 0)) {
            invoiceItemCacheModel.uuid = null;
        }

        invoiceItemCacheModel.id = getId();

        Date createDate = getCreateDate();

        if (createDate != null) {
            invoiceItemCacheModel.createDate = createDate.getTime();
        } else {
            invoiceItemCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            invoiceItemCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            invoiceItemCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        invoiceItemCacheModel.invoiceId = getInvoiceId();

        invoiceItemCacheModel.productCode = getProductCode();

        String productCode = invoiceItemCacheModel.productCode;

        if ((productCode != null) && (productCode.length() == 0)) {
            invoiceItemCacheModel.productCode = null;
        }

        invoiceItemCacheModel.productName = getProductName();

        String productName = invoiceItemCacheModel.productName;

        if ((productName != null) && (productName.length() == 0)) {
            invoiceItemCacheModel.productName = null;
        }

        invoiceItemCacheModel.number = getNumber();

        invoiceItemCacheModel.basePrice = getBasePrice();

        return invoiceItemCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", id=");
        sb.append(getId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", invoiceId=");
        sb.append(getInvoiceId());
        sb.append(", productCode=");
        sb.append(getProductCode());
        sb.append(", productName=");
        sb.append(getProductName());
        sb.append(", number=");
        sb.append(getNumber());
        sb.append(", basePrice=");
        sb.append(getBasePrice());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.arman.csb.modules.model.InvoiceItem");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>invoiceId</column-name><column-value><![CDATA[");
        sb.append(getInvoiceId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>productCode</column-name><column-value><![CDATA[");
        sb.append(getProductCode());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>productName</column-name><column-value><![CDATA[");
        sb.append(getProductName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>number</column-name><column-value><![CDATA[");
        sb.append(getNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>basePrice</column-name><column-value><![CDATA[");
        sb.append(getBasePrice());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}