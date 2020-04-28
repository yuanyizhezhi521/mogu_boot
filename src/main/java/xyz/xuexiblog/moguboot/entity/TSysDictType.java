package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 字典类型表(TSysDictType)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:33:02
 */
public class TSysDictType implements Serializable {
    private static final long serialVersionUID = 512737359738478870L;
    /**
    * 主键
    */
    private String uid;
    /**
    * 自增键oid
    */
    private Integer oid;
    /**
    * 字典名称
    */
    private String dictName;
    /**
    * 字典类型
    */
    private String dictType;
    /**
    * 创建人UID
    */
    private String createByUid;
    /**
    * 最后更新人UID
    */
    private String updateByUid;
    /**
    * 备注
    */
    private String remark;
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
    * 是否发布(1:是，0:否)
    */
    private String isPublish;
    /**
    * 排序字段
    */
    private Integer sort;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getCreateByUid() {
        return createByUid;
    }

    public void setCreateByUid(String createByUid) {
        this.createByUid = createByUid;
    }

    public String getUpdateByUid() {
        return updateByUid;
    }

    public void setUpdateByUid(String updateByUid) {
        this.updateByUid = updateByUid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(String isPublish) {
        this.isPublish = isPublish;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}