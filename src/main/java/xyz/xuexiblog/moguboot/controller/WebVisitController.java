package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.WebVisit;
import xyz.xuexiblog.moguboot.service.WebVisitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Web访问记录表(WebVisit)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:33:34
 */
@RestController
@RequestMapping("webVisit")
public class WebVisitController {
    /**
     * 服务对象
     */
    @Resource
    private WebVisitService webVisitService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public WebVisit selectOne(String id) {
        return this.webVisitService.queryById(id);
    }

}