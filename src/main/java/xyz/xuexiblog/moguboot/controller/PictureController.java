package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.Picture;
import xyz.xuexiblog.moguboot.service.PictureService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 图片表(Picture)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:20
 */
@RestController
@RequestMapping("picture")
public class PictureController {
    /**
     * 服务对象
     */
    @Resource
    private PictureService pictureService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Picture selectOne(String id) {
        return this.pictureService.queryById(id);
    }

}