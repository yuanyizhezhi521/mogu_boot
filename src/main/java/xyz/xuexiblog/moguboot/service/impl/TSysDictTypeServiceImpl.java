package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.TSysDictType;
import xyz.xuexiblog.moguboot.dao.TSysDictTypeDao;
import xyz.xuexiblog.moguboot.service.TSysDictTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 字典类型表(TSysDictType)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:33:02
 */
@Service("tSysDictTypeService")
public class TSysDictTypeServiceImpl implements TSysDictTypeService {
    @Resource
    private TSysDictTypeDao tSysDictTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public TSysDictType queryById(String uid) {
        return this.tSysDictTypeDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TSysDictType> queryAllByLimit(int offset, int limit) {
        return this.tSysDictTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tSysDictType 实例对象
     * @return 实例对象
     */
    @Override
    public TSysDictType insert(TSysDictType tSysDictType) {
        this.tSysDictTypeDao.insert(tSysDictType);
        return tSysDictType;
    }

    /**
     * 修改数据
     *
     * @param tSysDictType 实例对象
     * @return 实例对象
     */
    @Override
    public TSysDictType update(TSysDictType tSysDictType) {
        this.tSysDictTypeDao.update(tSysDictType);
        return this.queryById(tSysDictType.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.tSysDictTypeDao.deleteById(uid) > 0;
    }
}