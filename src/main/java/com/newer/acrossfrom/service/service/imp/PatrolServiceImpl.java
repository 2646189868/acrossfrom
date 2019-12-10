package com.newer.acrossfrom.service.service.imp;

import com.newer.acrossfrom.data.bean.Inspectiontask;
import com.newer.acrossfrom.data.mapper.PatrolMapper;
import com.newer.acrossfrom.service.service.PatrolService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PatrolServiceImpl implements PatrolService {
    @Resource
    private PatrolMapper patrolMapper;

    @Override
    public List<Inspectiontask> listPatrolTask() {
        return patrolMapper.listPatrolTask();
    }
}
