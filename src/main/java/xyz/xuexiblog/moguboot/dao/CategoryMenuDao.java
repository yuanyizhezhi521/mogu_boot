package xyz.xuexiblog.moguboot.dao;

import xyz.xuexiblog.moguboot.entity.CategoryMenu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 管理员表(CategoryMenu)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:31:32
 */
public interface CategoryMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    CategoryMenu queryById(String uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CategoryMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param categoryMenu 实例对象
     * @return 对象列表
     */
    List<CategoryMenu> queryAll(CategoryMenu categoryMenu);

    /**
     * 新增数据
     *
     * @param categoryMenu 实例对象
     * @return 影响行数
     */
    int insert(CategoryMenu categoryMenu);

    /**
     * 修改数据
     *
     * @param categoryMenu 实例对象
     * @return 影响行数
     */
    int update(CategoryMenu categoryMenu);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(String uid);

}