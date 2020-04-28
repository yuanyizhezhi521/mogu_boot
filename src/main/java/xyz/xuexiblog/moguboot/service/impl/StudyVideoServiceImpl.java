package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.StudyVideo;
import xyz.xuexiblog.moguboot.dao.StudyVideoDao;
import xyz.xuexiblog.moguboot.service.StudyVideoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 学习视频表(StudyVideo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:32:40
 */
@Service("studyVideoService")
public class StudyVideoServiceImpl implements StudyVideoService {
    @Resource
    private StudyVideoDao studyVideoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public StudyVideo queryById(String uid) {
        return this.studyVideoDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<StudyVideo> queryAllByLimit(int offset, int limit) {
        return this.studyVideoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param studyVideo 实例对象
     * @return 实例对象
     */
    @Override
    public StudyVideo insert(StudyVideo studyVideo) {
        this.studyVideoDao.insert(studyVideo);
        return studyVideo;
    }

    /**
     * 修改数据
     *
     * @param studyVideo 实例对象
     * @return 实例对象
     */
    @Override
    public StudyVideo update(StudyVideo studyVideo) {
        this.studyVideoDao.update(studyVideo);
        return this.queryById(studyVideo.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.studyVideoDao.deleteById(uid) > 0;
    }
}