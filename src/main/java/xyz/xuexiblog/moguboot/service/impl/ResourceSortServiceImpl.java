package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.ResourceSort;
import xyz.xuexiblog.moguboot.dao.ResourceSortDao;
import xyz.xuexiblog.moguboot.service.ResourceSortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 资源分类表(ResourceSort)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:30
 */
@Service("resourceSortService")
public class ResourceSortServiceImpl implements ResourceSortService {
    @Resource
    private ResourceSortDao resourceSortDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public ResourceSort queryById(String uid) {
        return this.resourceSortDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ResourceSort> queryAllByLimit(int offset, int limit) {
        return this.resourceSortDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param resourceSort 实例对象
     * @return 实例对象
     */
    @Override
    public ResourceSort insert(ResourceSort resourceSort) {
        this.resourceSortDao.insert(resourceSort);
        return resourceSort;
    }

    /**
     * 修改数据
     *
     * @param resourceSort 实例对象
     * @return 实例对象
     */
    @Override
    public ResourceSort update(ResourceSort resourceSort) {
        this.resourceSortDao.update(resourceSort);
        return this.queryById(resourceSort.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.resourceSortDao.deleteById(uid) > 0;
    }
}