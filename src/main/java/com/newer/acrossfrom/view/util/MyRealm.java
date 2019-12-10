package com.newer.acrossfrom.view.util;

import com.newer.acrossfrom.data.bean.Consumer;
import com.newer.acrossfrom.service.service.ConsumerService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MyRealm extends AuthenticatingRealm {
    @Resource
    ConsumerService consumerService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("进入认证方法");
        //1，获取令牌中的数据，账号
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        Consumer consumer=new Consumer();
        consumer.setUserCode(token.getUsername());
        consumer.setUserPassword(new String(token.getPassword()));
        //2，通过账号查询获取MongoDB数据库中对应的账号信息
      Consumer consumer1 = consumerService.login(consumer);

        Subject subject = SecurityUtils.getSubject();
        //将查询的对象放进去subject自带的session中去
        subject.getSession().setAttribute("user", consumer1);
        //如果有数据，对象为非null，说明查询到了数据，封装account返回
        if (consumer1 != null){
            return new SimpleAuthenticationInfo(consumer1,consumer1.getUserPassword(),getName());
        }else {
            //如果对象为空，return null就会抛出账户不存在异常
            return null;
        }
    }
}
