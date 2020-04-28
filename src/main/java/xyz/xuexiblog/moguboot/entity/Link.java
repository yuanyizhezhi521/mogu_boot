package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 友情链接表(Link)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:32:15
 */
public class Link implements Serializable {
    private static final long serialVersionUID = 548634720758007556L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 友情链接标题
    */
    private String title;
    /**
    * 友情链接介绍
    */
    private String summary;
    /**
    * 友情链接URL
    */
    private String url;
    /**
    * 点击数
    */
    private Integer clickCount;
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
    * 排序字段，越大越靠前
    */
    private Integer sort;
    /**
    * 友链状态： 0 申请中， 1：已上线，  2：已下架
    */
    private Object linkStatus;
    /**
    * 申请用户UID
    */
    private String userUid;
    /**
    * 操作管理员UID
    */
    private String adminUid;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Object getLinkStatus() {
        return linkStatus;
    }

    public void setLinkStatus(Object linkStatus) {
        this.linkStatus = linkStatus;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid;
    }

}