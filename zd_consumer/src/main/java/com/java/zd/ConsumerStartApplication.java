package com.java.zd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * time2020/4/11 18:24
 * author:吴树利
 * 消费者启动类
 */
@SpringBootApplication(scanBasePackages = "com.java.zd.*")
public class ConsumerStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerStartApplication.class);
    }

}
