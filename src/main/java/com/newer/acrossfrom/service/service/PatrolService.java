package com.newer.acrossfrom.service.service;

import com.newer.acrossfrom.data.bean.Inspectiontask;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface PatrolService {
    /**
     * 查看所有的巡检执行任务
     */
    public List<Inspectiontask> listPatrolTask();

}
