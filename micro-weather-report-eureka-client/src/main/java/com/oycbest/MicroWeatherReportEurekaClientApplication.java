package com.oycbest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 天气预报微服务-eureka客户端
 * @author ouyang
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class MicroWeatherReportEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherReportEurekaClientApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

}
