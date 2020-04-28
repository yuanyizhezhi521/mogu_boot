package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.Feedback;
import java.util.List;

/**
 * 反馈表(Feedback)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:32:00
 */
public interface FeedbackService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Feedback queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Feedback> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param feedback 实例对象
     * @return 实例对象
     */
    Feedback insert(Feedback feedback);

    /**
     * 修改数据
     *
     * @param feedback 实例对象
     * @return 实例对象
     */
    Feedback update(Feedback feedback);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}