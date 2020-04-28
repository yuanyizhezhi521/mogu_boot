package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.FileSort;
import xyz.xuexiblog.moguboot.service.FileSortService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文件分类表(FileSort)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:09
 */
@RestController
@RequestMapping("fileSort")
public class FileSortController {
    /**
     * 服务对象
     */
    @Resource
    private FileSortService fileSortService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FileSort selectOne(String id) {
        return this.fileSortService.queryById(id);
    }

}