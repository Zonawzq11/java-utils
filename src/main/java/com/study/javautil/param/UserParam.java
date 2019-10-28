package com.study.javautil.param;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class UserParam {
    @NotNull(message = "用户名称不能为空")
   private  String userName;
    @NotNull(message = "身份证不能为空")
   private  String idNumber;
    @NotNull(message = "身份证不能为空")
   private  Integer  userGge;
}
