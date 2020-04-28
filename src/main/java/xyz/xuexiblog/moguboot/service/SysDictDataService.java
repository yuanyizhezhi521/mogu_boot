package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.SysDictData;
import java.util.List;

/**
 * 字典数据表(SysDictData)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:32:46
 */
public interface SysDictDataService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    SysDictData queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysDictData> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysDictData 实例对象
     * @return 实例对象
     */
    SysDictData insert(SysDictData sysDictData);

    /**
     * 修改数据
     *
     * @param sysDictData 实例对象
     * @return 实例对象
     */
    SysDictData update(SysDictData sysDictData);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}