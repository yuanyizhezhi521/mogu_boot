package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Tag;
import xyz.xuexiblog.moguboot.service.TagService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 标签表(Tag)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:33:07
 */
@RestController
@RequestMapping("tag")
public class TagController {
    /**
     * 服务对象
     */
    @Resource
    private TagService tagService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Tag selectOne(String id) {
        return this.tagService.queryById(id);
    }

}