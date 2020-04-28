package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.ResourceSort;
import xyz.xuexiblog.moguboot.service.ResourceSortService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 资源分类表(ResourceSort)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:30
 */
@RestController
@RequestMapping("resourceSort")
public class ResourceSortController {
    /**
     * 服务对象
     */
    @Resource
    private ResourceSortService resourceSortService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ResourceSort selectOne(String id) {
        return this.resourceSortService.queryById(id);
    }

}