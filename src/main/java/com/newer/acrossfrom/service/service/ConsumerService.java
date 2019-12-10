package com.newer.acrossfrom.service.service;

import com.newer.acrossfrom.data.bean.Consumer;

import java.util.List;

public interface ConsumerService {
    int deleteByPrimaryKey(Integer userId);

    int insert(Consumer record);

    Consumer selectByPrimaryKey(Integer userId);

    List<Consumer> selectAll();

    int updateByPrimaryKey(Consumer record);
    /**
     * 登陆 跟据账号 密码
     * @param consumer
     * @return
     */
    Consumer login(Consumer consumer);
}
