package com.java.zd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * time2020/4/11 17:09
 * author:吴树利
 * 提供者1的项目启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.zd.*")
@MapperScan("com.java.zd.mapper")
public class Procider2StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(Procider2StartApplication.class);
    }
}
