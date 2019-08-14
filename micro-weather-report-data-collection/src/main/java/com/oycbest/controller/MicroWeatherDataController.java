package com.oycbest.controller;

import com.oycbest.constant.WeatherConstant;
import com.oycbest.service.MicroWeatherDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author oyc
 * @Title: MicroWeatherDataController
 * @ProjectName micro-weather-report-data-collection
 * @Description: 天气预报数据控制器
 * @date 2019/8/13 23:23
 */
@RestController
public class MicroWeatherDataController {

    @Resource
    private MicroWeatherDataService microWeatherDataService;

    @GetMapping("/data")
    public String getWeather() {
        System.out.println("weather report");
        String uri = WeatherConstant.WEATHER_URI;
        return microWeatherDataService.getWeahterByUri(uri);
    }

    @GetMapping("/data/cityId/{cityId}")
    public String getWeatherByCityId(@PathVariable String cityId) {
        System.out.println("weather report cityId:" + cityId);
        String uri = WeatherConstant.WEATHER_URI + "&cityid=" + cityId;
        return microWeatherDataService.getWeahterByUri(uri);
    }


    @GetMapping("/data/cityName/{cityName}")
    public String getWeatherByCityName(@PathVariable String cityName) {
        System.out.println("weather report cityName:" + cityName);
        String uri = WeatherConstant.WEATHER_URI + "&city=" + cityName;
        return microWeatherDataService.getWeahterByUri(uri);
    }


}
