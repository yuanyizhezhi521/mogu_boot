package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 系统配置表(SystemConfig)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:32:57
 */
public class SystemConfig implements Serializable {
    private static final long serialVersionUID = -11024082780735555L;
    /**
    * 主键
    */
    private String uid;
    /**
    * 七牛云公钥
    */
    private String qiNiuAccessKey;
    /**
    * 七牛云私钥
    */
    private String qiNiuSecretKey;
    /**
    * 邮箱账号
    */
    private String email;
    /**
    * 邮箱发件人用户名
    */
    private String emailUserName;
    /**
    * 邮箱密码
    */
    private String emailPassword;
    /**
    * SMTP地址
    */
    private String smtpAddress;
    /**
    * SMTP端口
    */
    private String smtpPort;
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
    * 七牛云上传空间
    */
    private String qiNiuBucket;
    /**
    * 七牛云存储区域 华东（z0），华北(z1)，华南(z2)，北美(na0)，东南亚(as0)
    */
    private String qiNiuArea;
    /**
    * 图片是否上传七牛云 (0:否， 1：是)
    */
    private String uploadQiNiu;
    /**
    * 图片是否上传本地存储 (0:否， 1：是)
    */
    private String uploadLocal;
    /**
    * 图片显示优先级（ 1 展示 七牛云,  0 本地）
    */
    private String picturePriority;
    /**
    * 七牛云域名前缀：http://images.moguit.cn
    */
    private String qiNiuPictureBaseUrl;
    /**
    * 本地服务器域名前缀：http://localhost:8600
    */
    private String localPictureBaseUrl;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getQiNiuAccessKey() {
        return qiNiuAccessKey;
    }

    public void setQiNiuAccessKey(String qiNiuAccessKey) {
        this.qiNiuAccessKey = qiNiuAccessKey;
    }

    public String getQiNiuSecretKey() {
        return qiNiuSecretKey;
    }

    public void setQiNiuSecretKey(String qiNiuSecretKey) {
        this.qiNiuSecretKey = qiNiuSecretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailUserName() {
        return emailUserName;
    }

    public void setEmailUserName(String emailUserName) {
        this.emailUserName = emailUserName;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }

    public String getSmtpAddress() {
        return smtpAddress;
    }

    public void setSmtpAddress(String smtpAddress) {
        this.smtpAddress = smtpAddress;
    }

    public String getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(String smtpPort) {
        this.smtpPort = smtpPort;
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

    public String getQiNiuBucket() {
        return qiNiuBucket;
    }

    public void setQiNiuBucket(String qiNiuBucket) {
        this.qiNiuBucket = qiNiuBucket;
    }

    public String getQiNiuArea() {
        return qiNiuArea;
    }

    public void setQiNiuArea(String qiNiuArea) {
        this.qiNiuArea = qiNiuArea;
    }

    public String getUploadQiNiu() {
        return uploadQiNiu;
    }

    public void setUploadQiNiu(String uploadQiNiu) {
        this.uploadQiNiu = uploadQiNiu;
    }

    public String getUploadLocal() {
        return uploadLocal;
    }

    public void setUploadLocal(String uploadLocal) {
        this.uploadLocal = uploadLocal;
    }

    public String getPicturePriority() {
        return picturePriority;
    }

    public void setPicturePriority(String picturePriority) {
        this.picturePriority = picturePriority;
    }

    public String getQiNiuPictureBaseUrl() {
        return qiNiuPictureBaseUrl;
    }

    public void setQiNiuPictureBaseUrl(String qiNiuPictureBaseUrl) {
        this.qiNiuPictureBaseUrl = qiNiuPictureBaseUrl;
    }

    public String getLocalPictureBaseUrl() {
        return localPictureBaseUrl;
    }

    public void setLocalPictureBaseUrl(String localPictureBaseUrl) {
        this.localPictureBaseUrl = localPictureBaseUrl;
    }

}