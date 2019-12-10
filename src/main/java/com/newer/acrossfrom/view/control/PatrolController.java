package com.newer.acrossfrom.view.control;

import com.newer.acrossfrom.data.bean.Inspectiontask;
import com.newer.acrossfrom.service.service.PatrolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
class PatrolController {
    @Autowired
    private PatrolService patrolService;

    @RequestMapping(value = "/listPatrol.do", method = RequestMethod.POST)
    public @ResponseBody
    List<Inspectiontask> listPatrol() {
        System.out.println("进入");
        List<Inspectiontask> list = patrolService.listPatrolTask();
        System.out.println("查询结果为" + list);
        return list;
    }

}
