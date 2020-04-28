package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.WebVisit;
import java.util.List;

/**
 * Web访问记录表(WebVisit)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:33:34
 */
public interface WebVisitService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    WebVisit queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<WebVisit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param webVisit 实例对象
     * @return 实例对象
     */
    WebVisit insert(WebVisit webVisit);

    /**
     * 修改数据
     *
     * @param webVisit 实例对象
     * @return 实例对象
     */
    WebVisit update(WebVisit webVisit);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}