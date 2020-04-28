package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.SystemConfig;
import xyz.xuexiblog.moguboot.dao.SystemConfigDao;
import xyz.xuexiblog.moguboot.service.SystemConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统配置表(SystemConfig)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:57
 */
@Service("systemConfigService")
public class SystemConfigServiceImpl implements SystemConfigService {
    @Resource
    private SystemConfigDao systemConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public SystemConfig queryById(String uid) {
        return this.systemConfigDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SystemConfig> queryAllByLimit(int offset, int limit) {
        return this.systemConfigDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param systemConfig 实例对象
     * @return 实例对象
     */
    @Override
    public SystemConfig insert(SystemConfig systemConfig) {
        this.systemConfigDao.insert(systemConfig);
        return systemConfig;
    }

    /**
     * 修改数据
     *
     * @param systemConfig 实例对象
     * @return 实例对象
     */
    @Override
    public SystemConfig update(SystemConfig systemConfig) {
        this.systemConfigDao.update(systemConfig);
        return this.queryById(systemConfig.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.systemConfigDao.deleteById(uid) > 0;
    }
}