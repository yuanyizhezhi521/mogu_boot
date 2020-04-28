package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 评论举报表(CommentReport)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:31:48
 */
public class CommentReport implements Serializable {
    private static final long serialVersionUID = 822547985886402272L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 举报人uid
    */
    private String userUid;
    /**
    * 被举报的评论Uid
    */
    private String reportCommentUid;
    /**
    * 被举报的用户uid
    */
    private String reportUserUid;
    /**
    * 举报的原因
    */
    private String content;
    /**
    * 进展状态: 0 未查看   1: 已查看  2：已处理
    */
    private Object progress;
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

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getReportCommentUid() {
        return reportCommentUid;
    }

    public void setReportCommentUid(String reportCommentUid) {
        this.reportCommentUid = reportCommentUid;
    }

    public String getReportUserUid() {
        return reportUserUid;
    }

    public void setReportUserUid(String reportUserUid) {
        this.reportUserUid = reportUserUid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getProgress() {
        return progress;
    }

    public void setProgress(Object progress) {
        this.progress = progress;
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