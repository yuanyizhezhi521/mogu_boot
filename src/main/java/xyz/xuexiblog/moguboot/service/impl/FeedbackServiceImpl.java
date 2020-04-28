package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.Feedback;
import xyz.xuexiblog.moguboot.dao.FeedbackDao;
import xyz.xuexiblog.moguboot.service.FeedbackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 反馈表(Feedback)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:00
 */
@Service("feedbackService")
public class FeedbackServiceImpl implements FeedbackService {
    @Resource
    private FeedbackDao feedbackDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Feedback queryById(String uid) {
        return this.feedbackDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Feedback> queryAllByLimit(int offset, int limit) {
        return this.feedbackDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param feedback 实例对象
     * @return 实例对象
     */
    @Override
    public Feedback insert(Feedback feedback) {
        this.feedbackDao.insert(feedback);
        return feedback;
    }

    /**
     * 修改数据
     *
     * @param feedback 实例对象
     * @return 实例对象
     */
    @Override
    public Feedback update(Feedback feedback) {
        this.feedbackDao.update(feedback);
        return this.queryById(feedback.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.feedbackDao.deleteById(uid) > 0;
    }
}