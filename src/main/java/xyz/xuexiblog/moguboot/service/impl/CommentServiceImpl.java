package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.Comment;
import xyz.xuexiblog.moguboot.dao.CommentDao;
import xyz.xuexiblog.moguboot.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 评论表(Comment)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:31:42
 */
@Service("commentService")
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentDao commentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Comment queryById(String uid) {
        return this.commentDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Comment> queryAllByLimit(int offset, int limit) {
        return this.commentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public Comment insert(Comment comment) {
        this.commentDao.insert(comment);
        return comment;
    }

    /**
     * 修改数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public Comment update(Comment comment) {
        this.commentDao.update(comment);
        return this.queryById(comment.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.commentDao.deleteById(uid) > 0;
    }
}