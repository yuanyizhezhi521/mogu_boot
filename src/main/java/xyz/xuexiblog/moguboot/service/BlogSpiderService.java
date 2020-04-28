package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.BlogSpider;
import java.util.List;

/**
 * 博客爬取表(BlogSpider)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:31:27
 */
public interface BlogSpiderService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    BlogSpider queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogSpider> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param blogSpider 实例对象
     * @return 实例对象
     */
    BlogSpider insert(BlogSpider blogSpider);

    /**
     * 修改数据
     *
     * @param blogSpider 实例对象
     * @return 实例对象
     */
    BlogSpider update(BlogSpider blogSpider);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}