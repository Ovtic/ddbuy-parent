package com.team.ddbuy.ddbuycommonservice;

import com.github.pagehelper.PageInfo;
import com.team.ddbuy.entity.TbContentCategory;
import com.team.ddbuy.service.TbContentCategoryService;
import com.team.ddbuy.utils.PageBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DdbuyCommonServiceApplicationTests {
    @Autowired
    private TbContentCategoryService tccService;

    @Test
    public void contextLoads() {
        PageBean page = new PageBean();
        page.setPage(1);
        page.setRows(3);
        PageInfo<TbContentCategory> pageInfo = tccService.getAllContentCategoryByPage(page);
        System.out.println("总记录数"+pageInfo.getTotal());
        for(TbContentCategory tcc:pageInfo.getList()){
            System.out.println("广告类型名称："+tcc.getName());
        }
    }

}
