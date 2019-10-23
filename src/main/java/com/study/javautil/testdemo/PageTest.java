package com.study.javautil.testdemo;

import com.study.javautil.model.PageReq;

public class PageTest {
    public static void main(String[] args) {
        PageReq pageReq = new PageReq();
        pageReq.init(0,0);
        System.out.println("pageNo："+ pageReq.getPNo());
    }
}
