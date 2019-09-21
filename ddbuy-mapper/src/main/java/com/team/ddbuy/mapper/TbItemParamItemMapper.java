package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbItemParamItem;
import com.team.ddbuy.entity.TbItemParamItemExample;

import java.util.List;

public interface TbItemParamItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbItemParamItem record);

    int insertSelective(TbItemParamItem record);

    List<TbItemParamItem> selectByExampleWithBLOBs(TbItemParamItemExample example);

    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    TbItemParamItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(TbItemParamItem record);

    int updateByPrimaryKey(TbItemParamItem record);
}