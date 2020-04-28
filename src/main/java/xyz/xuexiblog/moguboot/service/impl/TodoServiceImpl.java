package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.Todo;
import xyz.xuexiblog.moguboot.dao.TodoDao;
import xyz.xuexiblog.moguboot.service.TodoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 代办事项表(Todo)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:33:12
 */
@Service("todoService")
public class TodoServiceImpl implements TodoService {
    @Resource
    private TodoDao todoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public Todo queryById(String uid) {
        return this.todoDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Todo> queryAllByLimit(int offset, int limit) {
        return this.todoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param todo 实例对象
     * @return 实例对象
     */
    @Override
    public Todo insert(Todo todo) {
        this.todoDao.insert(todo);
        return todo;
    }

    /**
     * 修改数据
     *
     * @param todo 实例对象
     * @return 实例对象
     */
    @Override
    public Todo update(Todo todo) {
        this.todoDao.update(todo);
        return this.queryById(todo.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.todoDao.deleteById(uid) > 0;
    }
}