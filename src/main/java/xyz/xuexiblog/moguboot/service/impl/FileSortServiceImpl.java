package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.FileSort;
import xyz.xuexiblog.moguboot.dao.FileSortDao;
import xyz.xuexiblog.moguboot.service.FileSortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 文件分类表(FileSort)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:09
 */
@Service("fileSortService")
public class FileSortServiceImpl implements FileSortService {
    @Resource
    private FileSortDao fileSortDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public FileSort queryById(String uid) {
        return this.fileSortDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<FileSort> queryAllByLimit(int offset, int limit) {
        return this.fileSortDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fileSort 实例对象
     * @return 实例对象
     */
    @Override
    public FileSort insert(FileSort fileSort) {
        this.fileSortDao.insert(fileSort);
        return fileSort;
    }

    /**
     * 修改数据
     *
     * @param fileSort 实例对象
     * @return 实例对象
     */
    @Override
    public FileSort update(FileSort fileSort) {
        this.fileSortDao.update(fileSort);
        return this.queryById(fileSort.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.fileSortDao.deleteById(uid) > 0;
    }
}