package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.PictureSort;
import xyz.xuexiblog.moguboot.dao.PictureSortDao;
import xyz.xuexiblog.moguboot.service.PictureSortService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图片分类表(PictureSort)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:25
 */
@Service("pictureSortService")
public class PictureSortServiceImpl implements PictureSortService {
    @Resource
    private PictureSortDao pictureSortDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public PictureSort queryById(String uid) {
        return this.pictureSortDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<PictureSort> queryAllByLimit(int offset, int limit) {
        return this.pictureSortDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param pictureSort 实例对象
     * @return 实例对象
     */
    @Override
    public PictureSort insert(PictureSort pictureSort) {
        this.pictureSortDao.insert(pictureSort);
        return pictureSort;
    }

    /**
     * 修改数据
     *
     * @param pictureSort 实例对象
     * @return 实例对象
     */
    @Override
    public PictureSort update(PictureSort pictureSort) {
        this.pictureSortDao.update(pictureSort);
        return this.queryById(pictureSort.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.pictureSortDao.deleteById(uid) > 0;
    }
}