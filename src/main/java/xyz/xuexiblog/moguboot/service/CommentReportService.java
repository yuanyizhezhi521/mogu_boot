package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.CommentReport;
import java.util.List;

/**
 * 评论举报表(CommentReport)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:31:48
 */
public interface CommentReportService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    CommentReport queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CommentReport> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param commentReport 实例对象
     * @return 实例对象
     */
    CommentReport insert(CommentReport commentReport);

    /**
     * 修改数据
     *
     * @param commentReport 实例对象
     * @return 实例对象
     */
    CommentReport update(CommentReport commentReport);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}