package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.SysDictData;
import xyz.xuexiblog.moguboot.dao.SysDictDataDao;
import xyz.xuexiblog.moguboot.service.SysDictDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 字典数据表(SysDictData)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:46
 */
@Service("sysDictDataService")
public class SysDictDataServiceImpl implements SysDictDataService {
    @Resource
    private SysDictDataDao sysDictDataDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public SysDictData queryById(String uid) {
        return this.sysDictDataDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysDictData> queryAllByLimit(int offset, int limit) {
        return this.sysDictDataDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysDictData 实例对象
     * @return 实例对象
     */
    @Override
    public SysDictData insert(SysDictData sysDictData) {
        this.sysDictDataDao.insert(sysDictData);
        return sysDictData;
    }

    /**
     * 修改数据
     *
     * @param sysDictData 实例对象
     * @return 实例对象
     */
    @Override
    public SysDictData update(SysDictData sysDictData) {
        this.sysDictDataDao.update(sysDictData);
        return this.queryById(sysDictData.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.sysDictDataDao.deleteById(uid) > 0;
    }
}