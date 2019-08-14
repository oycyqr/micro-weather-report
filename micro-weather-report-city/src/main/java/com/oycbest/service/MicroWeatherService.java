package com.oycbest.service;

import java.io.IOException;
import java.util.List;

/**
 * @author oyc
 * @Title: MicroWeatherService
 * @ProjectName micro-weather-report-city
 * @Description: TODO
 * @date 2019/8/13 23:55
 */

public interface MicroWeatherService {
    public List cityList() throws IOException;
}
