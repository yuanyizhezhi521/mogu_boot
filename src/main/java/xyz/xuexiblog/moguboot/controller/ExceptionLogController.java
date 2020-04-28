package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.ExceptionLog;
import xyz.xuexiblog.moguboot.service.ExceptionLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ExceptionLog)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:53
 */
@RestController
@RequestMapping("exceptionLog")
public class ExceptionLogController {
    /**
     * 服务对象
     */
    @Resource
    private ExceptionLogService exceptionLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ExceptionLog selectOne(String id) {
        return this.exceptionLogService.queryById(id);
    }

}