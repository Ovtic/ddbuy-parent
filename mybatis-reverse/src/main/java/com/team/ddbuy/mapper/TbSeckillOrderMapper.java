package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbSeckillOrder;
import com.team.ddbuy.entity.TbSeckillOrderExample;
import java.util.List;

public interface TbSeckillOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillOrder record);

    int insertSelective(TbSeckillOrder record);

    List<TbSeckillOrder> selectByExample(TbSeckillOrderExample example);

    TbSeckillOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSeckillOrder record);

    int updateByPrimaryKey(TbSeckillOrder record);
}