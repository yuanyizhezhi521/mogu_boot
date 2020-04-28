package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 文件表(File)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:32:05
 */
public class File implements Serializable {
    private static final long serialVersionUID = -14236216316354863L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 旧文件名
    */
    private String fileOldName;
    /**
    * 文件名
    */
    private String picName;
    /**
    * 文件地址
    */
    private String picUrl;
    /**
    * 文件扩展名
    */
    private String picExpandedName;
    /**
    * 文件大小
    */
    private Integer fileSize;
    /**
    * 文件分类uid
    */
    private String fileSortUid;
    /**
    * 管理员uid
    */
    private String adminUid;
    /**
    * 用户uid
    */
    private String userUid;
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
    * 七牛云地址
    */
    private String qiNiuUrl;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFileOldName() {
        return fileOldName;
    }

    public void setFileOldName(String fileOldName) {
        this.fileOldName = fileOldName;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicExpandedName() {
        return picExpandedName;
    }

    public void setPicExpandedName(String picExpandedName) {
        this.picExpandedName = picExpandedName;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSortUid() {
        return fileSortUid;
    }

    public void setFileSortUid(String fileSortUid) {
        this.fileSortUid = fileSortUid;
    }

    public String getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
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

    public String getQiNiuUrl() {
        return qiNiuUrl;
    }

    public void setQiNiuUrl(String qiNiuUrl) {
        this.qiNiuUrl = qiNiuUrl;
    }

}