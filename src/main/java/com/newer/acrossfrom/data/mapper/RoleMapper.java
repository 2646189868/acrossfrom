package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Role;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Integer roleId);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);

    //查询记录总数
    public int getTotalCount();

    //根据页数计算当前页的全部记录
    //MyBatis为传递多个参数，必须使用HashMap
    public List<Role> selectByPage(Map<String, Object> param);
}