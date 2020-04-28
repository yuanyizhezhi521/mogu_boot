package xyz.xuexiblog.moguboot.controller;

import xyz.xuexiblog.moguboot.entity.PictureSort;
import xyz.xuexiblog.moguboot.service.PictureSortService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 图片分类表(PictureSort)表控制层
 *
 * @author makejava
 * @since 2020-04-21 12:32:25
 */
@RestController
@RequestMapping("pictureSort")
public class PictureSortController {
    /**
     * 服务对象
     */
    @Resource
    private PictureSortService pictureSortService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public PictureSort selectOne(String id) {
        return this.pictureSortService.queryById(id);
    }

}