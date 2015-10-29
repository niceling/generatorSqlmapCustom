package com.antteam.mapper;

import com.antteam.bean.NumberPageBean;
import com.antteam.bean.NumberPageBeanWithBLOBs;

public interface NumberPageBeanMapper {
    int deleteByPrimaryKey(Long order_id);

    int insert(NumberPageBeanWithBLOBs record);

    int insertSelective(NumberPageBeanWithBLOBs record);

    NumberPageBeanWithBLOBs selectByPrimaryKey(Long order_id);

    int updateByPrimaryKeySelective(NumberPageBeanWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NumberPageBeanWithBLOBs record);

    int updateByPrimaryKey(NumberPageBean record);
}