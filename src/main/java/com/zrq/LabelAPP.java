package com.zrq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zrq.mapper")
public class LabelAPP {
    public static void main(String[] args) {
        SpringApplication.run(LabelAPP.class,args);
    }
}
