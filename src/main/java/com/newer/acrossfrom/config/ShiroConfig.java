package com.newer.acrossfrom.config;


import com.newer.acrossfrom.view.util.MyRealm;
import com.newer.acrossfrom.view.util.PasswordMatcher;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Resource
    PasswordMatcher passwordMatcher;


    /**
     * @Bean 声明创建对象  并把对象放在工厂中  相当于bean标签
     * 如果形参类型对应的对象在工厂中有  会自动装配上
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(DefaultSecurityManager defaultSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        System.out.println("进入Shiro配置类");
        /**
         * 过滤器链 过滤拦截规则 哪些页面拦截  哪些页面不拦截
         */
        Map map = new HashMap();
        /**
         * anon 代表匿名可访问 就是不用登录就可以访问  登录页面  登录的url
         * authc 认证可访问 代表登录后才能访问
         * 支持通配符*
         * 注意拦截规则 一个一个配置
         */
        map.put("/login.do","anon");
        map.put("/**","authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);

        /**
         * 设置安全管理器，将创建的安全管理器放进shiroFilterFactoryBean过滤工厂里面
         */
        shiroFilterFactoryBean.setSecurityManager(defaultSecurityManager);
        return shiroFilterFactoryBean;
    }

    /**
     * 创建安全管理器,并将自定义的Realm放进去管理器
     * @return
     */
    @Bean
    public DefaultSecurityManager getDefaultSecurityManager(MyRealm myRealm){
//        单独对密码认证
//       myRealm.setCredentialsMatcher(passwordMatcher);
        DefaultSecurityManager defaultSecurityManager = new DefaultWebSecurityManager();
//        需要赋值一个Realm
        defaultSecurityManager.setRealm(myRealm);
        return defaultSecurityManager;
    }


}
