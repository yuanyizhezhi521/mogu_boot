package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 图片表(Picture)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:32:20
 */
public class Picture implements Serializable {
    private static final long serialVersionUID = -27568381851388970L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 图片uid
    */
    private String fileUid;
    /**
    * 图片名
    */
    private String picName;
    /**
    * 分类uid
    */
    private String pictureSortUid;
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

    public String getFileUid() {
        return fileUid;
    }

    public void setFileUid(String fileUid) {
        this.fileUid = fileUid;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPictureSortUid() {
        return pictureSortUid;
    }

    public void setPictureSortUid(String pictureSortUid) {
        this.pictureSortUid = pictureSortUid;
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