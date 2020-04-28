package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 学习视频表(StudyVideo)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:32:40
 */
public class StudyVideo implements Serializable {
    private static final long serialVersionUID = 211577901220915377L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 视频封面图片uid
    */
    private String fileUid;
    /**
    * 资源分类UID
    */
    private String resourceSortUid;
    /**
    * 视频名称
    */
    private String name;
    /**
    * 视频简介
    */
    private String summary;
    /**
    * 分类介绍
    */
    private String content;
    /**
    * 百度云完整路径
    */
    private String baiduPath;
    /**
    * 点击数
    */
    private String clickCount;
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
    
    private String parentUid;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFileUid() {
        return fileUid;
    }

    public void setFileUid(String fileUid) {
        this.fileUid = fileUid;
    }

    public String getResourceSortUid() {
        return resourceSortUid;
    }

    public void setResourceSortUid(String resourceSortUid) {
        this.resourceSortUid = resourceSortUid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBaiduPath() {
        return baiduPath;
    }

    public void setBaiduPath(String baiduPath) {
        this.baiduPath = baiduPath;
    }

    public String getClickCount() {
        return clickCount;
    }

    public void setClickCount(String clickCount) {
        this.clickCount = clickCount;
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

    public String getParentUid() {
        return parentUid;
    }

    public void setParentUid(String parentUid) {
        this.parentUid = parentUid;
    }

}