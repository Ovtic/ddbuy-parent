package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbOrder;
import com.team.ddbuy.entity.TbOrderExample;
import java.util.List;

public interface TbOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(TbOrder record);

    int insertSelective(TbOrder record);

    List<TbOrder> selectByExample(TbOrderExample example);

    TbOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TbOrder record);

    int updateByPrimaryKey(TbOrder record);
}