package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Admin;
import xyz.xuexiblog.moguboot.service.AdminService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 管理员表(Admin)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:09
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */
    @Resource
    private AdminService adminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Admin selectOne(String id) {
        return this.adminService.queryById(id);
    }

}