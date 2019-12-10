package com.newer.acrossfrom.view.control;

import com.newer.acrossfrom.data.bean.Role;
import com.newer.acrossfrom.service.service.RoleService;
import com.newer.acrossfrom.view.util.PageBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
/*跨域注解*/
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class RoleController {
    @Resource
    RoleService roleService;

    @RequestMapping(value = "queryRole.do",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> queryRolePages(PageBean page) {
        System.out.println("启动控制器分页：queryRolePages");
        System.out.println("传递的页号：" + page.getPageNo());
        System.out.println("传递的页大小：" + page.getPageSize());
        PageBean<Role> pageBeans = roleService.queryReturnBlogPage(page.getPageNo(), page.getPageSize());
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        System.out.println("控制器分页结果：" + pageBeans.toString());
        System.out.println("分页结果：" + pageBeans.getData().toString());
        paramsMap.put("list", pageBeans);
        return paramsMap;
    }

    //删除记录
    @RequestMapping(value="deleteRole.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean deleteStu(Integer roleId){
        System.out.println("启动控制器删除deleteRole");
        System.out.println("删除主键："+roleId);
        if (roleService.deleteByPrimaryKey(roleId)>0){
            return true;
        }
        return false;
    }

    //新增记录
    @RequestMapping(value="addRole.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean addStu(Role role){
        System.out.println("启动控制器新增addRole");
        System.out.println(role.toString());
        if (roleService.insert(role)>0){
            return  true;
        }
        return false;
    }

    //修改记录
    @RequestMapping(value="updateRole.do",method = RequestMethod.POST)
    @ResponseBody
    public  boolean updateStu(Role role){
        System.out.println("启动控制器修改updateRole");
        System.out.println(role.toString());
        if (roleService.updateByPrimaryKey(role)>0){
            return  true;
        }
        return false;
    }
}
