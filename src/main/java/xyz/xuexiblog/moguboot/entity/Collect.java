package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 收藏表(Collect)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:31:37
 */
public class Collect implements Serializable {
    private static final long serialVersionUID = -75751422079123990L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 用户的uid
    */
    private String userUid;
    /**
    * 博客的uid
    */
    private String blogUid;
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

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getBlogUid() {
        return blogUid;
    }

    public void setBlogUid(String blogUid) {
        this.blogUid = blogUid;
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