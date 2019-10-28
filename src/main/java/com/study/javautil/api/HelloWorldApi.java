package com.study.javautil.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/helloWorld")
public class HelloWorldApi {
    @RequestMapping("/sayHello")
    public Map sayHello(String userName){
        HashMap <String,String>hashMap = new HashMap();
        hashMap.put("name",userName);
        return hashMap;
    }
}
