package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.CommentReport;
import xyz.xuexiblog.moguboot.dao.CommentReportDao;
import xyz.xuexiblog.moguboot.service.CommentReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 评论举报表(CommentReport)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:31:48
 */
@Service("commentReportService")
public class CommentReportServiceImpl implements CommentReportService {
    @Resource
    private CommentReportDao commentReportDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public CommentReport queryById(String uid) {
        return this.commentReportDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CommentReport> queryAllByLimit(int offset, int limit) {
        return this.commentReportDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param commentReport 实例对象
     * @return 实例对象
     */
    @Override
    public CommentReport insert(CommentReport commentReport) {
        this.commentReportDao.insert(commentReport);
        return commentReport;
    }

    /**
     * 修改数据
     *
     * @param commentReport 实例对象
     * @return 实例对象
     */
    @Override
    public CommentReport update(CommentReport commentReport) {
        this.commentReportDao.update(commentReport);
        return this.queryById(commentReport.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.commentReportDao.deleteById(uid) > 0;
    }
}