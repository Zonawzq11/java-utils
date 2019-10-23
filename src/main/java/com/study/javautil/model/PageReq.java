package com.study.javautil.model;

import lombok.Data;

import javax.annotation.PostConstruct;

@Data
public class PageReq {
    private int pNo;
    private int pSize ;
    @PostConstruct
    public   void init(int pNo, int pSize) {
        if (pNo <= 0) {
            this.pNo = 1;
        }
        if (pSize <= 0) {
            this.pSize = 20;
        }
        if (pSize > 1000){
            this.pSize = 1000;
        }
    }
}
