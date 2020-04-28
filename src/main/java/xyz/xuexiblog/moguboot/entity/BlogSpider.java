package xyz.xuexiblog.moguboot.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 博客爬取表(BlogSpider)实体类
 *
 * @author makejava
 * @since 2020-04-21 12:31:27
 */
public class BlogSpider implements Serializable {
    private static final long serialVersionUID = 736074563707992834L;
    /**
    * 唯一uid
    */
    private String uid;
    /**
    * 博客标题
    */
    private String title;
    /**
    * 博客简介
    */
    private String summary;
    /**
    * 博客内容
    */
    private Object content;
    /**
    * 标签uid
    */
    private String tagUid;
    /**
    * 博客点击数
    */
    private Integer clickCount;
    /**
    * 博客收藏数
    */
    private Integer collectCount;
    /**
    * 标题图片uid
    */
    private String fileUid;
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
    * 管理员uid
    */
    private String adminUid;
    /**
    * 是否原创（0:不是 1：是）
    */
    private String isOriginal;
    /**
    * 作者
    */
    private String author;
    /**
    * 文章出处
    */
    private String articlesPart;
    /**
    * 博客分类UID
    */
    private String blogSortUid;
    /**
    * 推荐等级(0:正常)
    */
    private Object level;
    /**
    * 是否发布：0：否，1：是
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getTagUid() {
        return tagUid;
    }

    public void setTagUid(String tagUid) {
        this.tagUid = tagUid;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public String getFileUid() {
        return fileUid;
    }

    public void setFileUid(String fileUid) {
        this.fileUid = fileUid;
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

    public String getAdminUid() {
        return adminUid;
    }

    public void setAdminUid(String adminUid) {
        this.adminUid = adminUid;
    }

    public String getIsOriginal() {
        return isOriginal;
    }

    public void setIsOriginal(String isOriginal) {
        this.isOriginal = isOriginal;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArticlesPart() {
        return articlesPart;
    }

    public void setArticlesPart(String articlesPart) {
        this.articlesPart = articlesPart;
    }

    public String getBlogSortUid() {
        return blogSortUid;
    }

    public void setBlogSortUid(String blogSortUid) {
        this.blogSortUid = blogSortUid;
    }

    public Object getLevel() {
        return level;
    }

    public void setLevel(Object level) {
        this.level = level;
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