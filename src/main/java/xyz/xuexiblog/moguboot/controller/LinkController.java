package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Link;
import xyz.xuexiblog.moguboot.service.LinkService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 友情链接表(Link)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:15
 */
@RestController
@RequestMapping("link")
public class LinkController {
    /**
     * 服务对象
     */
    @Resource
    private LinkService linkService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Link selectOne(String id) {
        return this.linkService.queryById(id);
    }

}