package com.arman.csb.modules.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Score service. Represents a row in the &quot;CSBModules_Score&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arman.csb.modules.model.impl.ScoreModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arman.csb.modules.model.impl.ScoreImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Score
 * @see com.arman.csb.modules.model.impl.ScoreImpl
 * @see com.arman.csb.modules.model.impl.ScoreModelImpl
 * @generated
 */
public interface ScoreModel extends BaseModel<Score>, StagedGroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a score model instance should use the {@link Score} interface instead.
     */

    /**
     * Returns the primary key of this score.
     *
     * @return the primary key of this score
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this score.
     *
     * @param primaryKey the primary key of this score
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the uuid of this score.
     *
     * @return the uuid of this score
     */
    @AutoEscape
    @Override
    public String getUuid();

    /**
     * Sets the uuid of this score.
     *
     * @param uuid the uuid of this score
     */
    @Override
    public void setUuid(String uuid);

    /**
     * Returns the ID of this score.
     *
     * @return the ID of this score
     */
    public long getId();

    /**
     * Sets the ID of this score.
     *
     * @param id the ID of this score
     */
    public void setId(long id);

    /**
     * Returns the group ID of this score.
     *
     * @return the group ID of this score
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this score.
     *
     * @param groupId the group ID of this score
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this score.
     *
     * @return the company ID of this score
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this score.
     *
     * @param companyId the company ID of this score
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this score.
     *
     * @return the user ID of this score
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this score.
     *
     * @param userId the user ID of this score
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this score.
     *
     * @return the user uuid of this score
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this score.
     *
     * @param userUuid the user uuid of this score
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this score.
     *
     * @return the user name of this score
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this score.
     *
     * @param userName the user name of this score
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this score.
     *
     * @return the create date of this score
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this score.
     *
     * @param createDate the create date of this score
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this score.
     *
     * @return the modified date of this score
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this score.
     *
     * @param modifiedDate the modified date of this score
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the value of this score.
     *
     * @return the value of this score
     */
    public long getValue();

    /**
     * Sets the value of this score.
     *
     * @param value the value of this score
     */
    public void setValue(long value);

    /**
     * Returns the customer ID of this score.
     *
     * @return the customer ID of this score
     */
    public long getCustomerId();

    /**
     * Sets the customer ID of this score.
     *
     * @param customerId the customer ID of this score
     */
    public void setCustomerId(long customerId);

    /**
     * Returns the origin customer ID of this score.
     *
     * @return the origin customer ID of this score
     */
    public long getOriginCustomerId();

    /**
     * Sets the origin customer ID of this score.
     *
     * @param originCustomerId the origin customer ID of this score
     */
    public void setOriginCustomerId(long originCustomerId);

    /**
     * Returns the type of this score.
     *
     * @return the type of this score
     */
    public int getType();

    /**
     * Sets the type of this score.
     *
     * @param type the type of this score
     */
    public void setType(int type);

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
    public int compareTo(Score score);

    @Override
    public int hashCode();

    @Override
    public CacheModel<Score> toCacheModel();

    @Override
    public Score toEscapedModel();

    @Override
    public Score toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
