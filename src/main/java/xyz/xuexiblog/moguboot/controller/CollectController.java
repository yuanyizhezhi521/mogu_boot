package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Collect;
import xyz.xuexiblog.moguboot.service.CollectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 收藏表(Collect)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:37
 */
@RestController
@RequestMapping("collect")
public class CollectController {
    /**
     * 服务对象
     */
    @Resource
    private CollectService collectService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Collect selectOne(String id) {
        return this.collectService.queryById(id);
    }

}