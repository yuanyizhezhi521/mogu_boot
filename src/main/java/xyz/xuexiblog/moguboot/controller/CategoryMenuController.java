package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.CategoryMenu;
import xyz.xuexiblog.moguboot.service.CategoryMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 管理员表(CategoryMenu)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:31:32
 */
@RestController
@RequestMapping("categoryMenu")
public class CategoryMenuController {
    /**
     * 服务对象
     */
    @Resource
    private CategoryMenuService categoryMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CategoryMenu selectOne(String id) {
        return this.categoryMenuService.queryById(id);
    }

}