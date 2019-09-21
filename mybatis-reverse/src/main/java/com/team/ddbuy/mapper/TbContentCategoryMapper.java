package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbContentCategory;
import com.team.ddbuy.entity.TbContentCategoryExample;
import java.util.List;

public interface TbContentCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContentCategory record);

    int updateByPrimaryKey(TbContentCategory record);
}