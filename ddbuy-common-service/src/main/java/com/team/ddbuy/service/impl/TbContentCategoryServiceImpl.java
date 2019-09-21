package com.team.ddbuy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.ddbuy.entity.TbContentCategory;
import com.team.ddbuy.entity.TbContentCategoryExample;
import com.team.ddbuy.mapper.TbContentCategoryMapper;
import com.team.ddbuy.service.TbContentCategoryService;
import com.team.ddbuy.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service(interfaceClass = TbContentCategoryService.class)
public class TbContentCategoryServiceImpl<param> implements TbContentCategoryService {
    @Autowired(required = false)
    private TbContentCategoryMapper TccMapper;

    /* @Description
    * 分页查询所有广告类型
    * @param page
    * @Return PageInfo
    **/
    @Override
    public PageInfo<TbContentCategory> getAllContentCategoryByPage(PageBean page) {
        PageHelper.startPage(page.getPage(),page.getRows());
        List<TbContentCategory> list = TccMapper.selectByExample(new TbContentCategoryExample());
        PageInfo<TbContentCategory> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
