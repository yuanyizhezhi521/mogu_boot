package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 游客表(Visitor)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:33:23
 */
public class Visitor implements Serializable {
    private static final long serialVersionUID = 122400305406992676L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 登录次数
    */
    private Object loginCount;
    /**
    * 最后登录时间
    */
    private Date lastLoginTime;
    /**
    * 最后登录IP
    */
    private String lastLoginIp;
    /**
    * 状态
    */
    private Object status;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 更新时间
    */
    private Date updateTime;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Object loginCount) {
        this.loginCount = loginCount;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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

}