package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.WebVisit;
import xyz.xuexiblog.moguboot.dao.WebVisitDao;
import xyz.xuexiblog.moguboot.service.WebVisitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Web访问记录表(WebVisit)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:33:34
 */
@Service("webVisitService")
public class WebVisitServiceImpl implements WebVisitService {
    @Resource
    private WebVisitDao webVisitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public WebVisit queryById(String uid) {
        return this.webVisitDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<WebVisit> queryAllByLimit(int offset, int limit) {
        return this.webVisitDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param webVisit 实例对象
     * @return 实例对象
     */
    @Override
    public WebVisit insert(WebVisit webVisit) {
        this.webVisitDao.insert(webVisit);
        return webVisit;
    }

    /**
     * 修改数据
     *
     * @param webVisit 实例对象
     * @return 实例对象
     */
    @Override
    public WebVisit update(WebVisit webVisit) {
        this.webVisitDao.update(webVisit);
        return this.queryById(webVisit.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.webVisitDao.deleteById(uid) > 0;
    }
}