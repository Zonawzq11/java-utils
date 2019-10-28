package com.study.javautil.service;

import com.study.javautil.ownerannotition.ValidParam;
import com.study.javautil.param.UserParam;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ValidParamDemoService {

    @ValidParam
    public Map sayValidParam(UserParam user){
        System.out.println("say hello:" + user.getUserName());
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", user.getUserName());
        return map ;
    }
}
