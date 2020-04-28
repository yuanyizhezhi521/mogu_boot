package xyz.xuexiblog.moguboot.dao;

import xyz.xuexiblog.moguboot.entity.Visitor;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 游客表(Visitor)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:33:23
 */
public interface VisitorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Visitor queryById(String uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Visitor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param visitor 实例对象
     * @return 对象列表
     */
    List<Visitor> queryAll(Visitor visitor);

    /**
     * 新增数据
     *
     * @param visitor 实例对象
     * @return 影响行数
     */
    int insert(Visitor visitor);

    /**
     * 修改数据
     *
     * @param visitor 实例对象
     * @return 影响行数
     */
    int update(Visitor visitor);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(String uid);

}