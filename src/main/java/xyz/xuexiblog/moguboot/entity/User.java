package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(User)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:33:18
 */
public class User implements Serializable {
    private static final long serialVersionUID = -68808302294599017L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 用户名
    */
    private String userName;
    /**
    * 密码
    */
    private String passWord;
    /**
    * 性别(1:男2:女)
    */
    private Object gender;
    /**
    * 个人头像
    */
    private String avatar;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 出生年月日
    */
    private Date birthday;
    /**
    * 手机
    */
    private String mobile;
    /**
    * 邮箱验证码
    */
    private String validCode;
    /**
    * 自我简介最多150字
    */
    private String summary;
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
    /**
    * 昵称
    */
    private String nickName;
    /**
    * 资料来源
    */
    private String source;
    /**
    * 平台uuid
    */
    private String uuid;
    /**
    * QQ号
    */
    private String qqNumber;
    /**
    * 微信号
    */
    private String weChat;
    /**
    * 职业
    */
    private String occupation;
    /**
    * 评论状态 1:正常 0:禁言
    */
    private Object commentStatus;
    /**
    * ip来源
    */
    private String ipSource;
    /**
    * 浏览器
    */
    private String browser;
    /**
    * 操作系统
    */
    private String os;
    /**
    * 是否开启邮件通知 1:开启 0:关闭
    */
    private Object startEmailNotification;
    /**
    * 用户标签：0：普通，1：管理员，2：博主 等
    */
    private Object userTag;


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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getValidCode() {
        return validCode;
    }

    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Object getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Object commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Object getStartEmailNotification() {
        return startEmailNotification;
    }

    public void setStartEmailNotification(Object startEmailNotification) {
        this.startEmailNotification = startEmailNotification;
    }

    public Object getUserTag() {
        return userTag;
    }

    public void setUserTag(Object userTag) {
        this.userTag = userTag;
    }

}