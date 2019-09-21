package com.team.ddbuy.mapper;

import com.team.ddbuy.entity.TbUser;
import com.team.ddbuy.entity.TbUserExample;
import java.util.List;

public interface TbUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    List<TbUser> selectByExample(TbUserExample example);

    TbUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);
}