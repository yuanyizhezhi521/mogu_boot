package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.Blog;
import xyz.xuexiblog.moguboot.dao.BlogDao;
import xyz.xuexiblog.moguboot.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客表(Blog)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:31:17
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {
    @Resource
    private BlogDao blogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Blog queryById(String uid) {
        return this.blogDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Blog> queryAllByLimit(int offset, int limit) {
        return this.blogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param blog 实例对象
     * @return 实例对象
     */
    @Override
    public Blog insert(Blog blog) {
        this.blogDao.insert(blog);
        return blog;
    }

    /**
     * 修改数据
     *
     * @param blog 实例对象
     * @return 实例对象
     */
    @Override
    public Blog update(Blog blog) {
        this.blogDao.update(blog);
        return this.queryById(blog.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.blogDao.deleteById(uid) > 0;
    }
}