package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Visitor;
import xyz.xuexiblog.moguboot.service.VisitorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 游客表(Visitor)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:33:23
 */
@RestController
@RequestMapping("visitor")
public class VisitorController {
    /**
     * 服务对象
     */
    @Resource
    private VisitorService visitorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Visitor selectOne(String id) {
        return this.visitorService.queryById(id);
    }

}