package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.BlogSort;
import java.util.List;

/**
 * 博客分类表(BlogSort)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:31:22
 */
public interface BlogSortService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    BlogSort queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogSort> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param blogSort 实例对象
     * @return 实例对象
     */
    BlogSort insert(BlogSort blogSort);

    /**
     * 修改数据
     *
     * @param blogSort 实例对象
     * @return 实例对象
     */
    BlogSort update(BlogSort blogSort);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}