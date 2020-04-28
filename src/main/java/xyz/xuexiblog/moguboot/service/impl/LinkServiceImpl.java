package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.Link;
import xyz.xuexiblog.moguboot.dao.LinkDao;
import xyz.xuexiblog.moguboot.service.LinkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 友情链接表(Link)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:15
 */
@Service("linkService")
public class LinkServiceImpl implements LinkService {
    @Resource
    private LinkDao linkDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Link queryById(String uid) {
        return this.linkDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Link> queryAllByLimit(int offset, int limit) {
        return this.linkDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param link 实例对象
     * @return 实例对象
     */
    @Override
    public Link insert(Link link) {
        this.linkDao.insert(link);
        return link;
    }

    /**
     * 修改数据
     *
     * @param link 实例对象
     * @return 实例对象
     */
    @Override
    public Link update(Link link) {
        this.linkDao.update(link);
        return this.queryById(link.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.linkDao.deleteById(uid) > 0;
    }
}