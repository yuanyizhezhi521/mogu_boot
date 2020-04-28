package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.SysLog;
import xyz.xuexiblog.moguboot.service.SysLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysLog)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:51
 */
@RestController
@RequestMapping("sysLog")
public class SysLogController {
    /**
     * 服务对象
     */
    @Resource
    private SysLogService sysLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysLog selectOne(String id) {
        return this.sysLogService.queryById(id);
    }

}