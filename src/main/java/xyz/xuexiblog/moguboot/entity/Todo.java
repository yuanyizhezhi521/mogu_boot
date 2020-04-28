package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 代办事项表(Todo)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:33:12
 */
public class Todo implements Serializable {
    private static final long serialVersionUID = 110054033630643868L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 管理员uid
    */
    private String adminUid;
    /**
    * 内容
    */
    private String text;
    /**
    * 表示事项是否完成（0：未完成 1：已完成）
    */
    private Object done;
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

    public String getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Object getDone() {
        return done;
    }

    public void setDone(Object done) {
        this.done = done;
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