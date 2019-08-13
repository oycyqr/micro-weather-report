package com.oycbest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyang
 * 天气预报微服务-城市列表微服务
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MicroWeatherReportCityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherReportCityApplication.class, args);
    }

    @GetMapping("/city")
    public String city(){
        return "city";
    }

}
