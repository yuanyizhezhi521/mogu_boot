package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 反馈表(Feedback)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:32:00
 */
public class Feedback implements Serializable {
    private static final long serialVersionUID = 377148859089462646L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 用户uid
    */
    private String userUid;
    /**
    * 反馈的内容
    */
    private String content;
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
    * 反馈状态： 0：已开启  1：进行中  2：已完成  3：已拒绝
    */
    private Object feedbackStatus;
    /**
    * 回复
    */
    private String reply;
    /**
    * 管理员uid
    */
    private String adminUid;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
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

    public Object getFeedbackStatus() {
        return feedbackStatus;
    }

    public void setFeedbackStatus(Object feedbackStatus) {
        this.feedbackStatus = feedbackStatus;
    }

    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }

    public String getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid;
    }

}