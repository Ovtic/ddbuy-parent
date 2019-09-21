package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbSeckillGoods;
import com.team.ddbuy.entity.TbSeckillGoodsExample;
import java.util.List;

public interface TbSeckillGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbSeckillGoods record);

    int insertSelective(TbSeckillGoods record);

    List<TbSeckillGoods> selectByExample(TbSeckillGoodsExample example);

    TbSeckillGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbSeckillGoods record);

    int updateByPrimaryKey(TbSeckillGoods record);
}