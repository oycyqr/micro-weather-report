package com.oycbest.controller;

import com.oycbest.service.MicroWeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @author oyc
 * @Title: MicroWeatherCityController
 * @ProjectName micro-weather-report-city
 * @Description: TODO
 * @date 2019/8/13 23:54
 */
@RestController
public class MicroWeatherCityController {

    @Resource
    private MicroWeatherService microWeatherService;

    @GetMapping("/city/list")
    public List cityList() throws IOException {
        return microWeatherService.cityList();
    }
}
