package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.Visitor;
import xyz.xuexiblog.moguboot.dao.VisitorDao;
import xyz.xuexiblog.moguboot.service.VisitorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 游客表(Visitor)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:33:23
 */
@Service("visitorService")
public class VisitorServiceImpl implements VisitorService {
    @Resource
    private VisitorDao visitorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Visitor queryById(String uid) {
        return this.visitorDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Visitor> queryAllByLimit(int offset, int limit) {
        return this.visitorDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param visitor 实例对象
     * @return 实例对象
     */
    @Override
    public Visitor insert(Visitor visitor) {
        this.visitorDao.insert(visitor);
        return visitor;
    }

    /**
     * 修改数据
     *
     * @param visitor 实例对象
     * @return 实例对象
     */
    @Override
    public Visitor update(Visitor visitor) {
        this.visitorDao.update(visitor);
        return this.queryById(visitor.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.visitorDao.deleteById(uid) > 0;
    }
}