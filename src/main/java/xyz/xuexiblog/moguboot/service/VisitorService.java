package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.Visitor;
import java.util.List;

/**
 * 游客表(Visitor)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:33:23
 */
public interface VisitorService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Visitor queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Visitor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param visitor 实例对象
     * @return 实例对象
     */
    Visitor insert(Visitor visitor);

    /**
     * 修改数据
     *
     * @param visitor 实例对象
     * @return 实例对象
     */
    Visitor update(Visitor visitor);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}