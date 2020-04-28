package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.BlogSpider;
import xyz.xuexiblog.moguboot.dao.BlogSpiderDao;
import xyz.xuexiblog.moguboot.service.BlogSpiderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 博客爬取表(BlogSpider)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:31:27
 */
@Service("blogSpiderService")
public class BlogSpiderServiceImpl implements BlogSpiderService {
    @Resource
    private BlogSpiderDao blogSpiderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public BlogSpider queryById(String uid) {
        return this.blogSpiderDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<BlogSpider> queryAllByLimit(int offset, int limit) {
        return this.blogSpiderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param blogSpider 实例对象
     * @return 实例对象
     */
    @Override
    public BlogSpider insert(BlogSpider blogSpider) {
        this.blogSpiderDao.insert(blogSpider);
        return blogSpider;
    }

    /**
     * 修改数据
     *
     * @param blogSpider 实例对象
     * @return 实例对象
     */
    @Override
    public BlogSpider update(BlogSpider blogSpider) {
        this.blogSpiderDao.update(blogSpider);
        return this.queryById(blogSpider.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.blogSpiderDao.deleteById(uid) > 0;
    }
}