package xyz.xuexiblog.moguboot.service;

import xyz.xuexiblog.moguboot.entity.StudyVideo;
import java.util.List;

/**
 * 学习视频表(StudyVideo)表服务接口
 *
 * @author makejava
 * @since 2020-04-21 12:32:40
 */
public interface StudyVideoService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    StudyVideo queryById(String uid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<StudyVideo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param studyVideo 实例对象
     * @return 实例对象
     */
    StudyVideo insert(StudyVideo studyVideo);

    /**
     * 修改数据
     *
     * @param studyVideo 实例对象
     * @return 实例对象
     */
    StudyVideo update(StudyVideo studyVideo);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(String uid);

}