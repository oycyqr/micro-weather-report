package com.oycbest.controller;

import com.oycbest.client.WeatherReportCityClient;
import com.oycbest.client.WeatherReportDataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oyc
 * @Title: WeatherReportController
 * @ProjectName micro-weather-report-api
 * @Description: TODO
 * @date 2019/8/12 23:47
 */
@RestController
public class WeatherReportController {

    @Autowired
    private WeatherReportCityClient weatherReportCityClient;

    @Autowired
    private WeatherReportDataClient weatherReportDataClient;

    @GetMapping("/city")
    public String city() {
        return weatherReportCityClient.city();
    }

    @GetMapping("/data")
    public String data() {
        return weatherReportDataClient.data();
    }
}