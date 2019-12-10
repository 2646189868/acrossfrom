package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Inspectiontask;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author liming
 * date 2019-12-10
 */
public interface PatrolMapper {
    /**
     * 查看所有的巡检执行任务
     */
    public List<Inspectiontask> listPatrolTask();
}
