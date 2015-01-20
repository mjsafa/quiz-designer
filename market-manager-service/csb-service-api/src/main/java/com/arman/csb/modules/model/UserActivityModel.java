package com.arman.csb.modules.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the UserActivity service. Represents a row in the &quot;CSBModules_UserActivity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arman.csb.modules.model.impl.UserActivityModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arman.csb.modules.model.impl.UserActivityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserActivity
 * @see com.arman.csb.modules.model.impl.UserActivityImpl
 * @see com.arman.csb.modules.model.impl.UserActivityModelImpl
 * @generated
 */
public interface UserActivityModel extends BaseModel<UserActivity> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a user activity model instance should use the {@link UserActivity} interface instead.
     */

    /**
     * Returns the primary key of this user activity.
     *
     * @return the primary key of this user activity
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this user activity.
     *
     * @param primaryKey the primary key of this user activity
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this user activity.
     *
     * @return the uuid of this user activity
     */
    @AutoEscape
    public String getUuid();

    /**
     * Sets the uuid of this user activity.
     *
     * @param uuid the uuid of this user activity
     */
    public void setUuid(String uuid);

    /**
     * Returns the ID of this user activity.
     *
     * @return the ID of this user activity
     */
    public long getId();

    /**
     * Sets the ID of this user activity.
     *
     * @param id the ID of this user activity
     */
    public void setId(long id);

    /**
     * Returns the group ID of this user activity.
     *
     * @return the group ID of this user activity
     */
    public long getGroupId();

    /**
     * Sets the group ID of this user activity.
     *
     * @param groupId the group ID of this user activity
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this user activity.
     *
     * @return the company ID of this user activity
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this user activity.
     *
     * @param companyId the company ID of this user activity
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this user activity.
     *
     * @return the user ID of this user activity
     */
    public long getUserId();

    /**
     * Sets the user ID of this user activity.
     *
     * @param userId the user ID of this user activity
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this user activity.
     *
     * @return the user uuid of this user activity
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this user activity.
     *
     * @param userUuid the user uuid of this user activity
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this user activity.
     *
     * @return the user name of this user activity
     */
    @AutoEscape
    public String getUserName();

    /**
     * Sets the user name of this user activity.
     *
     * @param userName the user name of this user activity
     */
    public void setUserName(String userName);

    /**
     * Returns the create date of this user activity.
     *
     * @return the create date of this user activity
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this user activity.
     *
     * @param createDate the create date of this user activity
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the entity of this user activity.
     *
     * @return the entity of this user activity
     */
    @AutoEscape
    public String getEntity();

    /**
     * Sets the entity of this user activity.
     *
     * @param entity the entity of this user activity
     */
    public void setEntity(String entity);

    /**
     * Returns the action of this user activity.
     *
     * @return the action of this user activity
     */
    public Short getAction();

    /**
     * Sets the action of this user activity.
     *
     * @param action the action of this user activity
     */
    public void setAction(Short action);

    /**
     * Returns the importance of this user activity.
     *
     * @return the importance of this user activity
     */
    public Short getImportance();

    /**
     * Sets the importance of this user activity.
     *
     * @param importance the importance of this user activity
     */
    public void setImportance(Short importance);

    /**
     * Returns the data of this user activity.
     *
     * @return the data of this user activity
     */
    @AutoEscape
    public String getData();

    /**
     * Sets the data of this user activity.
     *
     * @param data the data of this user activity
     */
    public void setData(String data);

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
    public int compareTo(UserActivity userActivity);

    @Override
    public int hashCode();

    @Override
    public CacheModel<UserActivity> toCacheModel();

    @Override
    public UserActivity toEscapedModel();

    @Override
    public UserActivity toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
