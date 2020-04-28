package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.StudyVideo;
import xyz.xuexiblog.moguboot.service.StudyVideoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 学习视频表(StudyVideo)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:40
 */
@RestController
@RequestMapping("studyVideo")
public class StudyVideoController {
    /**
     * 服务对象
     */
    @Resource
    private StudyVideoService studyVideoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public StudyVideo selectOne(String id) {
        return this.studyVideoService.queryById(id);
    }

}