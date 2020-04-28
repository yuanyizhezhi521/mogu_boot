package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.WebConfig;
import xyz.xuexiblog.moguboot.dao.WebConfigDao;
import xyz.xuexiblog.moguboot.service.WebConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (WebConfig)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:33:28
 */
@Service("webConfigService")
public class WebConfigServiceImpl implements WebConfigService {
    @Resource
    private WebConfigDao webConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public WebConfig queryById(String uid) {
        return this.webConfigDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WebConfig> queryAllByLimit(int offset, int limit) {
        return this.webConfigDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param webConfig 实例对象
     * @return 实例对象
     */
    @Override
    public WebConfig insert(WebConfig webConfig) {
        this.webConfigDao.insert(webConfig);
        return webConfig;
    }

    /**
     * 修改数据
     *
     * @param webConfig 实例对象
     * @return 实例对象
     */
    @Override
    public WebConfig update(WebConfig webConfig) {
        this.webConfigDao.update(webConfig);
        return this.queryById(webConfig.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.webConfigDao.deleteById(uid) > 0;
    }
}