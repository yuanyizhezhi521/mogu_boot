package xyz.xuexiblog.moguboot.dao;

import xyz.xuexiblog.moguboot.entity.PictureSort;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 图片分类表(PictureSort)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-21 12:32:25
 */
public interface PictureSortDao {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    PictureSort queryById(String uid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<PictureSort> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param pictureSort 实例对象
     * @return 对象列表
     */
    List<PictureSort> queryAll(PictureSort pictureSort);

    /**
     * 新增数据
     *
     * @param pictureSort 实例对象
     * @return 影响行数
     */
    int insert(PictureSort pictureSort);

    /**
     * 修改数据
     *
     * @param pictureSort 实例对象
     * @return 影响行数
     */
    int update(PictureSort pictureSort);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 影响行数
     */
    int deleteById(String uid);

}