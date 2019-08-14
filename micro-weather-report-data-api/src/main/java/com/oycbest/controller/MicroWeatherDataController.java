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

    @GetMapping("/data/cityId/{cityId}")
    public String getWeatherByCityId(@PathVariable String cityId) {
        return microWeatherDataService.getWeahterByCityId(cityId);
    }
}
