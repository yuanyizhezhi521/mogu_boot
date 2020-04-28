package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Role;
import xyz.xuexiblog.moguboot.service.RoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Role)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:35
 */
@RestController
@RequestMapping("role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Role selectOne(String id) {
        return this.roleService.queryById(id);
    }

}