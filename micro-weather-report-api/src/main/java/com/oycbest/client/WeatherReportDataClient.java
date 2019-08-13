package com.oycbest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author oyc
 * @Title: WeatherReportService
 * @ProjectName micro-weather-report-api
 * @Description: TODO
 * @date 2019/8/12 23:55
 */
@FeignClient(value = "micro-weather-report-data")
public interface WeatherReportDataClient {

    @GetMapping("/data")
    public String data();

    /*@RequestMapping(value = "/data", method = RequestMethod.GET)
    public String data();*/
}
