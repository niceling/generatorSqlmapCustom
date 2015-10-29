package com.antteam.mapper;

import com.antteam.bean.NumberBean;

public interface NumberBeanMapper {
    int deleteByPrimaryKey(Long order_id);

    int insert(NumberBean record);

    int insertSelective(NumberBean record);

    NumberBean selectByPrimaryKey(Long order_id);

    int updateByPrimaryKeySelective(NumberBean record);

    int updateByPrimaryKey(NumberBean record);
}