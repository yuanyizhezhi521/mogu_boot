package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.CategoryMenu;
import java.util.List;

/**
 * 管理员表(CategoryMenu)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:31:32
 */
public interface CategoryMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    CategoryMenu queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CategoryMenu> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param categoryMenu 实例对象
     * @return 实例对象
     */
    CategoryMenu insert(CategoryMenu categoryMenu);

    /**
     * 修改数据
     *
     * @param categoryMenu 实例对象
     * @return 实例对象
     */
    CategoryMenu update(CategoryMenu categoryMenu);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}