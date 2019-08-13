package com.oycbest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心 启动类
 * @author ouyang
 */

@SpringBootApplication
@EnableEurekaServer
public class MicroWeatherReportEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherReportEurekaServerApplication.class, args);
    }

}
