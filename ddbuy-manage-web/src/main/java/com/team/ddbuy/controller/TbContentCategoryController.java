package com.team.ddbuy.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.team.ddbuy.entity.TbContentCategory;
import com.team.ddbuy.service.TbContentCategoryService;
import com.team.ddbuy.utils.PageBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TbContentCategoryController {
    @Reference(interfaceClass = TbContentCategoryService.class)
    private TbContentCategoryService tccService;

    @RequestMapping("/getTbContentCategoryByPage")
    public Map<String,Object> getTbContentCategoryByPage(PageBean page){
        PageInfo<TbContentCategory> pageInfo = tccService.getAllContentCategoryByPage(page);
        Map<String,Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }
}
