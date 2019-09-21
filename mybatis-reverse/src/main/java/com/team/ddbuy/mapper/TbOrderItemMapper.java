package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbOrderItem;
import com.team.ddbuy.entity.TbOrderItemExample;
import java.util.List;

public interface TbOrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbOrderItem record);

    int insertSelective(TbOrderItem record);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    TbOrderItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TbOrderItem record);

    int updateByPrimaryKey(TbOrderItem record);
}