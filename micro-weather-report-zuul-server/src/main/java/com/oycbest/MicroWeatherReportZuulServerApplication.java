package com.oycbest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author ouyang
 */
@SpringBootApplication
//开启Zuul的API网关服务功能
@EnableZuulProxy
@EnableDiscoveryClient
public class MicroWeatherReportZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherReportZuulServerApplication.class, args);
    }

}
