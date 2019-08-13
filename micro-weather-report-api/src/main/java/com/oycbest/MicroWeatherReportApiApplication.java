package com.oycbest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyang
 * 天气预报微服务-api
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class MicroWeatherReportApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherReportApiApplication.class, args);
    }

    @GetMapping("/api")
    public String api(){
        return "api";
    }

}
