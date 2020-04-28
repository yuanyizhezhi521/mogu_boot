package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.Picture;
import java.util.List;

/**
 * 图片表(Picture)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:32:20
 */
public interface PictureService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    Picture queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Picture> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param picture 实例对象
     * @return 实例对象
     */
    Picture insert(Picture picture);

    /**
     * 修改数据
     *
     * @param picture 实例对象
     * @return 实例对象
     */
    Picture update(Picture picture);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}