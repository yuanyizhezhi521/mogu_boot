package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.WebConfig;
import xyz.xuexiblog.moguboot.service.WebConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (WebConfig)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:33:28
 */
@RestController
@RequestMapping("webConfig")
public class WebConfigController {
    /**
     * 服务对象
     */
    @Resource
    private WebConfigService webConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WebConfig selectOne(String id) {
        return this.webConfigService.queryById(id);
    }

}