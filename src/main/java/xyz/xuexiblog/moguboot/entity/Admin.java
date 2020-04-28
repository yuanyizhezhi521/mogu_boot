package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;
/**
 * 管理员表(Admin)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:31:07
 */
public class Admin implements Serializable {
    private static final long serialVersionUID = -63093098069918424L;
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
    private String gender;
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
    * github地址
    */
    private String github;
    /**
    * gitee地址
    */
    private String gitee;
    /**
    * 拥有的角色uid
    */
    private String roleUid;
    /**
    * 履历
    */
    private String personResume;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
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

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getGitee() {
        return gitee;
    }

    public void setGitee(String gitee) {
        this.gitee = gitee;
    }

    public String getRoleUid() {
        return roleUid;
    }

    public void setRoleUid(String roleUid) {
        this.roleUid = roleUid;
    }

    public String getPersonResume() {
        return personResume;
    }

    public void setPersonResume(String personResume) {
        this.personResume = personResume;
    }

}