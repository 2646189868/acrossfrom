package com.newer.acrossfrom.service.service.imp;

import com.newer.acrossfrom.data.bean.Consumer;
import com.newer.acrossfrom.data.mapper.ConsumerMapper;
import com.newer.acrossfrom.service.service.ConsumerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Resource
    ConsumerMapper consumerMapper;

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return consumerMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(Consumer record) {
        return consumerMapper.insert(record);
    }

    @Override
    public Consumer selectByPrimaryKey(Integer userId) {
        return consumerMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<Consumer> selectAll() {
        return consumerMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Consumer record) {
        return consumerMapper.updateByPrimaryKey(record);
    }

    @Override
    public Consumer login(Consumer consumer) {
        return consumerMapper.login(consumer);
    }
}
