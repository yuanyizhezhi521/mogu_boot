package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Todo;
import xyz.xuexiblog.moguboot.service.TodoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 代办事项表(Todo)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:33:12
 */
@RestController
@RequestMapping("todo")
public class TodoController {
    /**
     * 服务对象
     */
    @Resource
    private TodoService todoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Todo selectOne(String id) {
        return this.todoService.queryById(id);
    }

}