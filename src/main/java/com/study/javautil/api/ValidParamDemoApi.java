package com.study.javautil.api;

import com.study.javautil.param.UserParam;
import com.study.javautil.service.ValidParamDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/validParamDemoApi")
public class ValidParamDemoApi {
    @Autowired
    ValidParamDemoService validParamDemoService;
    @RequestMapping("/sayValidParam")
    public Map sayValidParam(UserParam user){
      return   validParamDemoService.sayValidParam(user);
    }
}
