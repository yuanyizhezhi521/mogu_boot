package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:32:35
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 256651092290448467L;
    /**
    * 角色id
    */
    private String uid;
    /**
    * 角色名
    */
    private String roleName;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;
    /**
    * 状态
    */
    private Object status;
    /**
    * 角色介绍
    */
    private String summary;
    /**
    * 角色管辖的菜单的UID
    */
    private String categoryMenuUids;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCategoryMenuUids() {
        return categoryMenuUids;
    }

    public void setCategoryMenuUids(String categoryMenuUids) {
        this.categoryMenuUids = categoryMenuUids;
    }

}