package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.SystemConfig;
import xyz.xuexiblog.moguboot.service.SystemConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 系统配置表(SystemConfig)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:57
 */
@RestController
@RequestMapping("systemConfig")
public class SystemConfigController {
    /**
     * 服务对象
     */
    @Resource
    private SystemConfigService systemConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SystemConfig selectOne(String id) {
        return this.systemConfigService.queryById(id);
    }

}