package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ExceptionLog)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:31:53
 */
public class ExceptionLog implements Serializable {
    private static final long serialVersionUID = 471155238962703130L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 异常对象json格式
    */
    private Object exceptionJson;
    /**
    * 异常信息
    */
    private Object exceptionMessage;
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
    * ip地址
    */
    private String ip;
    /**
    * ip来源
    */
    private String ipSource;
    /**
    * 请求方法
    */
    private String method;
    /**
    * 方法描述
    */
    private String operation;
    /**
    * 请求参数
    */
    private Object params;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Object getExceptionJson() {
        return exceptionJson;
    }

    public void setExceptionJson(Object exceptionJson) {
        this.exceptionJson = exceptionJson;
    }

    public Object getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(Object exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

}