package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.TSysDictType;
import xyz.xuexiblog.moguboot.service.TSysDictTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 字典类型表(TSysDictType)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:33:02
 */
@RestController
@RequestMapping("tSysDictType")
public class TSysDictTypeController {
    /**
     * 服务对象
     */
    @Resource
    private TSysDictTypeService tSysDictTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TSysDictType selectOne(String id) {
        return this.tSysDictTypeService.queryById(id);
    }

}