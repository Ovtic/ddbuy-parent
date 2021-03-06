package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbOrderShipping;
import com.team.ddbuy.entity.TbOrderShippingExample;

import java.util.List;

public interface TbOrderShippingMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TbOrderShipping record);

    int insertSelective(TbOrderShipping record);

    List<TbOrderShipping> selectByExample(TbOrderShippingExample example);

    TbOrderShipping selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TbOrderShipping record);

    int updateByPrimaryKey(TbOrderShipping record);
}