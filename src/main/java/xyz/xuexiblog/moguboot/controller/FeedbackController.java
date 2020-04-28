package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Feedback;
import xyz.xuexiblog.moguboot.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 反馈表(Feedback)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:00
 */
@RestController
@RequestMapping("feedback")
public class FeedbackController {
    /**
     * 服务对象
     */
    @Resource
    private FeedbackService feedbackService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Feedback selectOne(String id) {
        return this.feedbackService.queryById(id);
    }

}