package com.newer.acrossfrom.data.mapper;

import com.newer.acrossfrom.data.bean.Consumer;
import java.math.BigDecimal;
import java.util.List;

public interface ConsumerMapper {
//    删除
    int deleteByPrimaryKey(Integer userId);
//    增加
    int insert(Consumer record);
//   根据主键查询
    Consumer selectByPrimaryKey(Integer userId);
//   查询所有
    List<Consumer> selectAll();

    /**
     * 根据主键修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Consumer record);

    /**
     * 登陆 跟据账号 密码
     * @param consumer
     * @return
     */
    Consumer login(Consumer consumer);
}