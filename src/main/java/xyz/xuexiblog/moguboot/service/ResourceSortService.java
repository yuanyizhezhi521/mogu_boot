package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.ResourceSort;
import java.util.List;

/**
 * 资源分类表(ResourceSort)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:32:30
 */
public interface ResourceSortService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    ResourceSort queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<ResourceSort> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param resourceSort 实例对象
     * @return 实例对象
     */
    ResourceSort insert(ResourceSort resourceSort);

    /**
     * 修改数据
     *
     * @param resourceSort 实例对象
     * @return 实例对象
     */
    ResourceSort update(ResourceSort resourceSort);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}