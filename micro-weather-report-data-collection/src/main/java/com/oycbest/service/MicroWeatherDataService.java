package com.oycbest.service;

/**
 * @author oyc
 * @Title: MicroWeatherDataService
 * @ProjectName micro-weather-report-data-collection
 * @Description: 城市天气数据获取服务-接口
 * @date 2019/8/14 22:18
 */
public interface MicroWeatherDataService {

    /**
     * 根据uri获取城市天气预报情况
     *
     * @param uri
     * @return
     */
    String getWeahterByUri(String uri);

    /**
     * 通过城市Id同步天气数据
     * @param cityId
     * @return
     */
    void syncWeahterByCityId(String cityId);
}
