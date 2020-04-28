package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.CommentReport;
import xyz.xuexiblog.moguboot.service.CommentReportService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 评论举报表(CommentReport)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:48
 */
@RestController
@RequestMapping("commentReport")
public class CommentReportController {
    /**
     * 服务对象
     */
    @Resource
    private CommentReportService commentReportService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CommentReport selectOne(String id) {
        return this.commentReportService.queryById(id);
    }

}