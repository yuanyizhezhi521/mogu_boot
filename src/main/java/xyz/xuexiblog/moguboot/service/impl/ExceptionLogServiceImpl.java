package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.ExceptionLog;
import xyz.xuexiblog.moguboot.dao.ExceptionLogDao;
import xyz.xuexiblog.moguboot.service.ExceptionLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ExceptionLog)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:31:53
 */
@Service("exceptionLogService")
public class ExceptionLogServiceImpl implements ExceptionLogService {
    @Resource
    private ExceptionLogDao exceptionLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public ExceptionLog queryById(String uid) {
        return this.exceptionLogDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<ExceptionLog> queryAllByLimit(int offset, int limit) {
        return this.exceptionLogDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    @Override
    public ExceptionLog insert(ExceptionLog exceptionLog) {
        this.exceptionLogDao.insert(exceptionLog);
        return exceptionLog;
    }

    /**
     * 修改数据
     *
     * @param exceptionLog 实例对象
     * @return 实例对象
     */
    @Override
    public ExceptionLog update(ExceptionLog exceptionLog) {
        this.exceptionLogDao.update(exceptionLog);
        return this.queryById(exceptionLog.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.exceptionLogDao.deleteById(uid) > 0;
    }
}