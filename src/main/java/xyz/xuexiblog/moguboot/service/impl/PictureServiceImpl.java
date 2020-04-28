package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.Picture;
import xyz.xuexiblog.moguboot.dao.PictureDao;
import xyz.xuexiblog.moguboot.service.PictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 图片表(Picture)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:20
 */
@Service("pictureService")
public class PictureServiceImpl implements PictureService {
    @Resource
    private PictureDao pictureDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Picture queryById(String uid) {
        return this.pictureDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Picture> queryAllByLimit(int offset, int limit) {
        return this.pictureDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param picture 实例对象
     * @return 实例对象
     */
    @Override
    public Picture insert(Picture picture) {
        this.pictureDao.insert(picture);
        return picture;
    }

    /**
     * 修改数据
     *
     * @param picture 实例对象
     * @return 实例对象
     */
    @Override
    public Picture update(Picture picture) {
        this.pictureDao.update(picture);
        return this.queryById(picture.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.pictureDao.deleteById(uid) > 0;
    }
}