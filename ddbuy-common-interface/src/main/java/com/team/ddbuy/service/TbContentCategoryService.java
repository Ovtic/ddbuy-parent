package com.team.ddbuy.service;

import com.github.pagehelper.PageInfo;
import com.team.ddbuy.entity.TbContentCategory;
import com.team.ddbuy.utils.PageBean;

public interface TbContentCategoryService {
    PageInfo<TbContentCategory> getAllContentCategoryByPage(PageBean page);
}
