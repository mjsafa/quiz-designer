package com.arman.csb.modules.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.arman.csb.modules.service.http.ProductServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.arman.csb.modules.service.http.ProductServiceSoap
 * @generated
 */
public class ProductSoap implements Serializable {
    private String _uuid;
    private long _id;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _code;
    private long _basePrice;
    private long _score;

    public ProductSoap() {
    }

    public static ProductSoap toSoapModel(Product model) {
        ProductSoap soapModel = new ProductSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setId(model.getId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setCode(model.getCode());
        soapModel.setBasePrice(model.getBasePrice());
        soapModel.setScore(model.getScore());

        return soapModel;
    }

    public static ProductSoap[] toSoapModels(Product[] models) {
        ProductSoap[] soapModels = new ProductSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ProductSoap[][] toSoapModels(Product[][] models) {
        ProductSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ProductSoap[models.length][models[0].length];
        } else {
            soapModels = new ProductSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ProductSoap[] toSoapModels(List<Product> models) {
        List<ProductSoap> soapModels = new ArrayList<ProductSoap>(models.size());

        for (Product model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ProductSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        _code = code;
    }

    public long getBasePrice() {
        return _basePrice;
    }

    public void setBasePrice(long basePrice) {
        _basePrice = basePrice;
    }

    public long getScore() {
        return _score;
    }

    public void setScore(long score) {
        _score = score;
    }
}