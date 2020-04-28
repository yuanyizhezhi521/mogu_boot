package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 管理员表(CategoryMenu)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:31:32
 */
public class CategoryMenu implements Serializable {
    private static final long serialVersionUID = -80707407089720719L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 菜单名称
    */
    private String name;
    /**
    * 菜单级别
    */
    private Object menuLevel;
    /**
    * 简介
    */
    private String summary;
    /**
    * 父uid
    */
    private String parentUid;
    /**
    * url地址
    */
    private String url;
    /**
    * 图标
    */
    private String icon;
    /**
    * 排序字段，越大越靠前
    */
    private Integer sort;
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
    /**
    * 是否显示 1:是 0:否
    */
    private Object isShow;
    /**
    * 菜单类型 0: 菜单   1: 按钮
    */
    private Object menuType;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Object menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getParentUid() {
        return parentUid;
    }

    public void setParentUid(String parentUid) {
        this.parentUid = parentUid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    public Object getIsShow() {
        return isShow;
    }

    public void setIsShow(Object isShow) {
        this.isShow = isShow;
    }

    public Object getMenuType() {
        return menuType;
    }

    public void setMenuType(Object menuType) {
        this.menuType = menuType;
    }

}