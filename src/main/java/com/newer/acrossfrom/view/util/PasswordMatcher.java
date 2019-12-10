package com.newer.acrossfrom.view.util;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Component;

@Component
public class PasswordMatcher extends HashedCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        System.out.println("调用了密码对比器");
        UsernamePasswordToken utoken = (UsernamePasswordToken) token;
            /*[把AuthenticationToken 中的token 装换为AuthenticationToken 中的（ps:查看方法Ctrl+t）
            UsernamePasswordToken实现类 因为AuthenticationToken 是接口不能new数据]，*/
        String pwd = new String(utoken.getPassword());
        //通过utoken 获取用户密码，并转换成String类型，注意这里的转换不能强转，要用new的方法

        //通过AuthenticationInfo 的info 查询数据库的密码 装换成String类型
        String credentials = (String) info.getCredentials();
        System.out.println(Md5Hash.fromHexString(credentials));

        //对比用户输入的数据和数据库密码是否一致。return走，返回到Action方法中。
        return equals(Md5Hash.fromHexString(credentials), pwd);

    }
}
