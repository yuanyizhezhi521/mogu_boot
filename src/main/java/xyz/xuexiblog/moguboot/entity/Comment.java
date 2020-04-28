package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 评论表(Comment)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:31:42
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = 776730618588692311L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 用户uid
    */
    private String userUid;
    /**
    * 回复某条评论的uid
    */
    private String toUid;
    /**
    * 回复某个人的uid
    */
    private String toUserUid;
    /**
    * 评论内容
    */
    private String content;
    /**
    * 博客uid
    */
    private String blogUid;
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
    * 评论来源： MESSAGE_BOARD，ABOUT，BLOG_INFO 等
    */
    private String source;
    /**
    * 评论类型 1:点赞 0:评论
    */
    private Object type;
    /**
    * 一级评论UID
    */
    private String firstCommentUid;


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

    public String getToUid() {
        return toUid;
    }

    public void setToUid(String toUid) {
        this.toUid = toUid;
    }

    public String getToUserUid() {
        return toUserUid;
    }

    public void setToUserUid(String toUserUid) {
        this.toUserUid = toUserUid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBlogUid() {
        return blogUid;
    }

    public void setBlogUid(String blogUid) {
        this.blogUid = blogUid;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public String getFirstCommentUid() {
        return firstCommentUid;
    }

    public void setFirstCommentUid(String firstCommentUid) {
        this.firstCommentUid = firstCommentUid;
    }

}