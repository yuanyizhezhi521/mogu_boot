package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.Collect;
import xyz.xuexiblog.moguboot.dao.CollectDao;
import xyz.xuexiblog.moguboot.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 收藏表(Collect)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:31:37
 */
@Service("collectService")
public class CollectServiceImpl implements CollectService {
    @Resource
    private CollectDao collectDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Collect queryById(String uid) {
        return this.collectDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Collect> queryAllByLimit(int offset, int limit) {
        return this.collectDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param collect 实例对象
     * @return 实例对象
     */
    @Override
    public Collect insert(Collect collect) {
        this.collectDao.insert(collect);
        return collect;
    }

    /**
     * 修改数据
     *
     * @param collect 实例对象
     * @return 实例对象
     */
    @Override
    public Collect update(Collect collect) {
        this.collectDao.update(collect);
        return this.queryById(collect.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.collectDao.deleteById(uid) > 0;
    }
}