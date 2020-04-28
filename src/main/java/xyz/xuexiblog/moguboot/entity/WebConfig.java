package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (WebConfig)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:33:28
 */
public class WebConfig implements Serializable {
    private static final long serialVersionUID = -93786551235656008L;
    /**
    * 主键
    */
    private String uid;
    /**
    * logo(文件UID)
    */
    private String logo;
    /**
    * 网站名称
    */
    private String name;
    /**
    * 介绍
    */
    private String summary;
    /**
    * 关键字
    */
    private String keyword;
    /**
    * 作者
    */
    private String author;
    /**
    * 备案号
    */
    private String recordNum;
    /**
    * 是否开启评论(0:否 1:是)
    */
    private String startComment;
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
    * 标题
    */
    private String title;
    /**
    * 支付宝收款码FileId
    */
    private String aliPay;
    /**
    * 微信收款码FileId
    */
    private String weixinPay;
    /**
    * github地址
    */
    private String github;
    /**
    * gitee地址
    */
    private String gitee;
    /**
    * QQ号
    */
    private String qqNumber;
    /**
    * QQ群
    */
    private String qqGroup;
    /**
    * 微信号
    */
    private String weChat;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 显示的列表（用于控制邮箱、QQ、QQ群、Github、Gitee、微信是否显示在前端）
    */
    private String showList;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
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

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(String recordNum) {
        this.recordNum = recordNum;
    }

    public String getStartComment() {
        return startComment;
    }

    public void setStartComment(String startComment) {
        this.startComment = startComment;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAliPay() {
        return aliPay;
    }

    public void setAliPay(String aliPay) {
        this.aliPay = aliPay;
    }

    public String getWeixinPay() {
        return weixinPay;
    }

    public void setWeixinPay(String weixinPay) {
        this.weixinPay = weixinPay;
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

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber;
    }

    public String getQqGroup() {
        return qqGroup;
    }

    public void setQqGroup(String qqGroup) {
        this.qqGroup = qqGroup;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShowList() {
        return showList;
    }

    public void setShowList(String showList) {
        this.showList = showList;
    }

}