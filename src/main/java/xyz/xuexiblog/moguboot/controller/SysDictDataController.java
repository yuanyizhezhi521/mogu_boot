package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.SysDictData;
import xyz.xuexiblog.moguboot.service.SysDictDataService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 字典数据表(SysDictData)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:46
 */
@RestController
@RequestMapping("sysDictData")
public class SysDictDataController {
    /**
     * 服务对象
     */
    @Resource
    private SysDictDataService sysDictDataService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysDictData selectOne(String id) {
        return this.sysDictDataService.queryById(id);
    }

}