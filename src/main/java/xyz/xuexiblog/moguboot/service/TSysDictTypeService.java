package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.TSysDictType;
import java.util.List;

/**
 * 字典类型表(TSysDictType)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:33:02
 */
public interface TSysDictTypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    TSysDictType queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSysDictType> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tSysDictType 实例对象
     * @return 实例对象
     */
    TSysDictType insert(TSysDictType tSysDictType);

    /**
     * 修改数据
     *
     * @param tSysDictType 实例对象
     * @return 实例对象
     */
    TSysDictType update(TSysDictType tSysDictType);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}