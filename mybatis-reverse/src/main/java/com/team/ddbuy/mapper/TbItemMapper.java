package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbItem;
import com.team.ddbuy.entity.TbItemExample;
import java.util.List;

public interface TbItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItem record);

    int insertSelective(TbItem record);

    List<TbItem> selectByExample(TbItemExample example);

    TbItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItem record);

    int updateByPrimaryKey(TbItem record);
}