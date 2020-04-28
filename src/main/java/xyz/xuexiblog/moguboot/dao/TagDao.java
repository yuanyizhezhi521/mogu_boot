package xyz.xuexiblog.moguboot.dao;

import xyz.xuexiblog.moguboot.entity.Tag;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 标签表(Tag)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:33:07
 */
public interface TagDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Tag queryById(String uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Tag> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tag 实例对象
     * @return 对象列表
     */
    List<Tag> queryAll(Tag tag);

    /**
     * 新增数据
     *
     * @param tag 实例对象
     * @return 影响行数
     */
    int insert(Tag tag);

    /**
     * 修改数据
     *
     * @param tag 实例对象
     * @return 影响行数
     */
    int update(Tag tag);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(String uid);

}