package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.File;
import xyz.xuexiblog.moguboot.service.FileService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文件表(File)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:05
 */
@RestController
@RequestMapping("file")
public class FileController {
    /**
     * 服务对象
     */
    @Resource
    private FileService fileService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public File selectOne(String id) {
        return this.fileService.queryById(id);
    }

}