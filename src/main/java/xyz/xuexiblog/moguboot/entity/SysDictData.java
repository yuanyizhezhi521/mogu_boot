package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 字典数据表(SysDictData)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:32:46
 */
public class SysDictData implements Serializable {
    private static final long serialVersionUID = -57128883903777526L;
    /**
    * 主键
    */
    private String uid;
    /**
    * 自增键oid
    */
    private Integer oid;
    /**
    * 字典类型UID
    */
    private String dictTypeUid;
    /**
    * 字典标签
    */
    private String dictLabel;
    /**
    * 字典键值
    */
    private String dictValue;
    /**
    * 样式属性（其他样式扩展）
    */
    private String cssClass;
    /**
    * 表格回显样式
    */
    private String listClass;
    /**
    * 是否默认（1是 0否）,默认为0
    */
    private Object isDefault;
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

    public String getDictTypeUid() {
        return dictTypeUid;
    }

    public void setDictTypeUid(String dictTypeUid) {
        this.dictTypeUid = dictTypeUid;
    }

    public String getDictLabel() {
        return dictLabel;
    }

    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getListClass() {
        return listClass;
    }

    public void setListClass(String listClass) {
        this.listClass = listClass;
    }

    public Object getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Object isDefault) {
        this.isDefault = isDefault;
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