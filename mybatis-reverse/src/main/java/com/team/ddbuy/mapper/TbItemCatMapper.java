package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbItemCat;
import com.team.ddbuy.entity.TbItemCatExample;
import java.util.List;

public interface TbItemCatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemCat record);

    int insertSelective(TbItemCat record);

    List<TbItemCat> selectByExample(TbItemCatExample example);

    TbItemCat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemCat record);

    int updateByPrimaryKey(TbItemCat record);
}