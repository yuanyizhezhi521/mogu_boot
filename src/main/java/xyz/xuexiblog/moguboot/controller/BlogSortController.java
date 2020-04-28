package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.BlogSort;
import xyz.xuexiblog.moguboot.service.BlogSortService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 博客分类表(BlogSort)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:22
 */
@RestController
@RequestMapping("blogSort")
public class BlogSortController {
    /**
     * 服务对象
     */
    @Resource
    private BlogSortService blogSortService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BlogSort selectOne(String id) {
        return this.blogSortService.queryById(id);
    }

}