package com.oycbest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyang
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MicroWeatherReportDataCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherReportDataCollectionApplication.class, args);
    }

}
