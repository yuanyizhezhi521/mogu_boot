package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 标签表(Tag)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:33:07
 */
public class Tag implements Serializable {
    private static final long serialVersionUID = 641782581829789899L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 标签内容
    */
    private String content;
    /**
    * 状态
    */
    private Object status;
    /**
    * 标签简介
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
    * 排序字段，越大越靠前
    */
    private Integer sort;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}