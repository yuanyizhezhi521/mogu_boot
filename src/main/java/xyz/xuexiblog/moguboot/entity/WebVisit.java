package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * Web访问记录表(WebVisit)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:33:34
 */
public class WebVisit implements Serializable {
    private static final long serialVersionUID = 841991856810318298L;
    /**
    * 主键
    */
    private String uid;
    /**
    * 用户uid
    */
    private String userUid;
    /**
    * 访问ip地址
    */
    private String ip;
    /**
    * 用户行为
    */
    private String behavior;
    /**
    * 模块uid（文章uid，标签uid，分类uid）
    */
    private String moduleUid;
    /**
    * 附加数据(比如搜索内容)
    */
    private String otherData;
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
    * 操作系统
    */
    private String os;
    /**
    * 浏览器
    */
    private String browser;
    /**
    * ip来源
    */
    private String ipSource;


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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getModuleUid() {
        return moduleUid;
    }

    public void setModuleUid(String moduleUid) {
        this.moduleUid = moduleUid;
    }

    public String getOtherData() {
        return otherData;
    }

    public void setOtherData(String otherData) {
        this.otherData = otherData;
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

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource;
    }

}