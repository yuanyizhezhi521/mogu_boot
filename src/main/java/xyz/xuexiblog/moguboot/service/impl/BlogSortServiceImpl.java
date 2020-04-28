package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.BlogSort;
import xyz.xuexiblog.moguboot.dao.BlogSortDao;
import xyz.xuexiblog.moguboot.service.BlogSortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客分类表(BlogSort)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:31:22
 */
@Service("blogSortService")
public class BlogSortServiceImpl implements BlogSortService {
    @Resource
    private BlogSortDao blogSortDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public BlogSort queryById(String uid) {
        return this.blogSortDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BlogSort> queryAllByLimit(int offset, int limit) {
        return this.blogSortDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param blogSort 实例对象
     * @return 实例对象
     */
    @Override
    public BlogSort insert(BlogSort blogSort) {
        this.blogSortDao.insert(blogSort);
        return blogSort;
    }

    /**
     * 修改数据
     *
     * @param blogSort 实例对象
     * @return 实例对象
     */
    @Override
    public BlogSort update(BlogSort blogSort) {
        this.blogSortDao.update(blogSort);
        return this.queryById(blogSort.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.blogSortDao.deleteById(uid) > 0;
    }
}