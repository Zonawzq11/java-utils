package com.study.javautil.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 参数校验类
 */

public class ParamCheckUtil {
    public static <T> Map checkParam(String operationMsg, T dto) {
        HashMap<String, Object> map = new HashMap<>();
        String msg = BeanValidator.getInstance().validate(dto);
        if (StringUtils.isNotEmpty(msg)) {
           // log.error(operationMsg + "参数校验失败:{}", msg);
             map.put("msg",msg);
             map.put("flag",false);
             return  map;
        }
        map.put("flag",true);
        return  map;
    }
}
