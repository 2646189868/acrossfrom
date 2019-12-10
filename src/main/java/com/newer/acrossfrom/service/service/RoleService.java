package com.newer.acrossfrom.service.service;

import com.newer.acrossfrom.data.bean.Role;
import com.newer.acrossfrom.view.util.PageBean;

import java.math.BigDecimal;
import java.util.List;

public interface RoleService {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    Role selectByPrimaryKey(Integer roleId);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);

    /**
     * 分页查询消息
     * @param
     * @return
     */
    PageBean<Role> queryReturnBlogPage(int pageNo, int pageSize);
}
