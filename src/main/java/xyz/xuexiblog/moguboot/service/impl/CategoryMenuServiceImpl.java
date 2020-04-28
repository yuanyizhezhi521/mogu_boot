package xyz.xuexiblog.moguboot.service.impl;

import xyz.xuexiblog.moguboot.entity.CategoryMenu;
import xyz.xuexiblog.moguboot.dao.CategoryMenuDao;
import xyz.xuexiblog.moguboot.service.CategoryMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 管理员表(CategoryMenu)表服务实现类
 *
 * @author makejava
 * @since 2020-04-21 12:31:32
 */
@Service("categoryMenuService")
public class CategoryMenuServiceImpl implements CategoryMenuService {
    @Resource
    private CategoryMenuDao categoryMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public CategoryMenu queryById(String uid) {
        return this.categoryMenuDao.queryById(uid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CategoryMenu> queryAllByLimit(int offset, int limit) {
        return this.categoryMenuDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param categoryMenu 实例对象
     * @return 实例对象
     */
    @Override
    public CategoryMenu insert(CategoryMenu categoryMenu) {
        this.categoryMenuDao.insert(categoryMenu);
        return categoryMenu;
    }

    /**
     * 修改数据
     *
     * @param categoryMenu 实例对象
     * @return 实例对象
     */
    @Override
    public CategoryMenu update(CategoryMenu categoryMenu) {
        this.categoryMenuDao.update(categoryMenu);
        return this.queryById(categoryMenu.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String uid) {
        return this.categoryMenuDao.deleteById(uid) > 0;
    }
}