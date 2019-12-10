package com.newer.acrossfrom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.newer.acrossfrom.data.mapper")
@SpringBootApplication(scanBasePackages  = {"com.newer.acrossfrom"})
public class AcrossfromApplication {

    public static void main(String[] args) {
        SpringApplication.run(AcrossfromApplication.class, args);
    }

}
