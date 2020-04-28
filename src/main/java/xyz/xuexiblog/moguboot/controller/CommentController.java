package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Comment;
import xyz.xuexiblog.moguboot.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 评论表(Comment)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:42
 */
@RestController
@RequestMapping("comment")
public class CommentController {
    /**
     * 服务对象
     */
    @Resource
    private CommentService commentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Comment selectOne(String id) {
        return this.commentService.queryById(id);
    }

}