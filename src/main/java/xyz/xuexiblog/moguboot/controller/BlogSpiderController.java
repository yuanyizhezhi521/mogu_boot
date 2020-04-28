package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.BlogSpider;
import xyz.xuexiblog.moguboot.service.BlogSpiderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 博客爬取表(BlogSpider)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:27
 */
@RestController
@RequestMapping("blogSpider")
public class BlogSpiderController {
    /**
     * 服务对象
     */
    @Resource
    private BlogSpiderService blogSpiderService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public BlogSpider selectOne(String id) {
        return this.blogSpiderService.queryById(id);
    }

}