package com.newer.acrossfrom.view.control;

import com.newer.acrossfrom.data.bean.Consumer;
import com.newer.acrossfrom.service.service.ConsumerService;
import net.sf.json.JSONObject;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;


@Controller
/*跨域注解*/
@CrossOrigin(methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ConsumerController {

    @Autowired
    ConsumerService consumerService;

    @RequestMapping(value = "login.do", method = RequestMethod.POST)
    @ResponseBody
    public Consumer login(@RequestBody String jsonClass) throws UnsupportedEncodingException {
        System.out.println("进入登陆方法");
        String json = URLDecoder.decode(jsonClass, "utf-8");
        String newJson = json.substring(0, json.lastIndexOf("="));
        JSONObject jsonObject = JSONObject.fromObject(newJson);
//		1.将用户输入的账号密码 封装在token中
        UsernamePasswordToken token = new UsernamePasswordToken(jsonObject.getString("userCode"), jsonObject.getString("userPassword"));
//        2.获取Subject
        Subject subject = SecurityUtils.getSubject();
//        3.通过Subject 的login方法 完成登录
        try {
            subject.login(token);
            //到这里如果没有异常说明登录成功，
            return (Consumer) subject.getSession().getAttribute("user");
        } catch (Exception e) {
            //有异常说明登录失败，重定向到登录页面
            System.out.println(e.getMessage());
            return null;
        }
    }
}
