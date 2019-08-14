package com.oycbest.service.impl;

import com.oycbest.constant.WeatherConstant;
import com.oycbest.service.MicroWeatherDataService;
import com.oycbest.util.RedisUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author oyc
 * @Title: MicroWeatherDataServiceImpl
 * @ProjectName micro-weather-report-data-collection
 * @Description: 城市天气数据获取服务-实现
 * @date 2019/8/14 22:19
 */
@Service
public class MicroWeatherDataServiceImpl implements MicroWeatherDataService {

    @Resource
    private RestTemplate restTemplate;

    @Override
    public String getWeahterByCityId(String cityId) {
        Object dataObj = RedisUtil.get(cityId);
        if(dataObj != null && StringUtils.isNotBlank(dataObj.toString())){
            return RedisUtil.get(cityId).toString();
        }else{
            // 调用服务接口获取天气情况
            ResponseEntity<String> weather = restTemplate.getForEntity(WeatherConstant.WEATHER_URI + "&cityid=" + cityId, String.class);
            return weather.getBody();
        }

    }
}
