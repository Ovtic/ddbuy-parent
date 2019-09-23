package com.team.ddbuy.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.team.ddbuy.entity.TbContent;
import com.team.ddbuy.mapper.TbContentMapper;
import com.team.ddbuy.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = TbContentService.class)
public class TbContentServiceImpl implements TbContentService {
    @Autowired(required = false)
    private TbContentMapper contentMapper;

    @Override
    public int addContent(TbContent tbContent) {
        return contentMapper.insertSelective(tbContent);
    }
}
