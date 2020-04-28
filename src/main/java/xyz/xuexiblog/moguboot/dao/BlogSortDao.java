package xyz.xuexiblog.moguboot.dao;

import xyz.xuexiblog.moguboot.entity.BlogSort;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 博客分类表(BlogSort)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:31:22
 */
public interface BlogSortDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    BlogSort queryById(String uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<BlogSort> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param blogSort 实例对象
     * @return 对象列表
     */
    List<BlogSort> queryAll(BlogSort blogSort);

    /**
     * 新增数据
     *
     * @param blogSort 实例对象
     * @return 影响行数
     */
    int insert(BlogSort blogSort);

    /**
     * 修改数据
     *
     * @param blogSort 实例对象
     * @return 影响行数
     */
    int update(BlogSort blogSort);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(String uid);

}