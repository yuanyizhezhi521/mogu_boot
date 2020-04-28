package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Blog;
import xyz.xuexiblog.moguboot.service.BlogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 博客表(Blog)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:17
 */
@RestController
@RequestMapping("blog")
public class BlogController {
    /**
     * 服务对象
     */
    @Resource
    private BlogService blogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Blog selectOne(String id) {
        return this.blogService.queryById(id);
    }

}