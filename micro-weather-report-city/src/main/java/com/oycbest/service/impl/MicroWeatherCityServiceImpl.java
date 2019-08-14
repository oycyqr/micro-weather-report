package com.oycbest.service.impl;

import com.oycbest.service.MicroWeatherService;
import com.oycbest.util.JsonUtil;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author oyc
 * @Title: MicroWeatherCityServiceImpl
 * @ProjectName micro-weather-report-city
 * @Description: TODO
 * @date 2019/8/13 23:57
 */
@Service
public class MicroWeatherCityServiceImpl implements MicroWeatherService {

    @Override
    public List cityList() throws IOException {
        // 读取项目路径下的文件 json/person.json
        List list = JsonUtil.readJsonFromClassPath("city.json", List.class);
        return list;
    }
}
