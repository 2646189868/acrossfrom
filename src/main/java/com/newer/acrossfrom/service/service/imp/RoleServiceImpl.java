package com.newer.acrossfrom.service.service.imp;

import com.newer.acrossfrom.data.bean.Role;
import com.newer.acrossfrom.data.mapper.RoleMapper;
import com.newer.acrossfrom.service.service.RoleService;
import com.newer.acrossfrom.view.util.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    RoleMapper roleMapper;


    @Override
    public int deleteByPrimaryKey(Integer roleId) {
        return roleMapper.deleteByPrimaryKey(roleId);
    }

    @Override
    public int insert(Role record) {
        return roleMapper.insert(record);
    }

    @Override
    public Role selectByPrimaryKey(Integer roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    @Override
    public List<Role> selectAll() {
        return roleMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return roleMapper.updateByPrimaryKey(record);
    }

    @Override
    public PageBean<Role> queryReturnBlogPage(int pageNo, int pageSize) {
        System.out.println("业务层实现分页：queryReturnBlogPage");
        PageBean<Role> pageBean = new PageBean<Role>();
        try {
            Map<String, Object> parms = new HashMap<String, Object>();
            //第一页：pageNo:1
            //每页2条记录:pageSize:2
            int start = (pageNo - 1) * pageSize + 1;
            int end = pageNo * pageSize;
            parms.put("startIndex", start);//每一页第一条记录编号
            parms.put("endIndex", end);//每一页最后一条记录编号
            List<Role> students = roleMapper.selectByPage(parms);//分页查询
            int totalCount = roleMapper.getTotalCount();//记录总数
            pageBean.setData(students);
            pageBean.setTotalRecords(totalCount);
            pageBean.setPageNo(pageNo);
            pageBean.setPageSize(pageSize);
            System.out.println("业务层返回的分页结果："+pageBean.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageBean;
    }
}
