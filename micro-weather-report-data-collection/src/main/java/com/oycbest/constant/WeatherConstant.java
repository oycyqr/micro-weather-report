package com.oycbest.constant;

/**
 * @author oyc
 * @Title: WeatherConstant
 * @ProjectName micro-weather-report-data-collection
 * @Description: 天气预报数据获取常量类
 * @date 2019/8/13 23:34
 */
public class WeatherConstant {
    /**
     * 天气预报获取地址
     */
    public static String WEATHER_URI = "https://www.tianqiapi.com/api/?version=v6";

    /**
     * 天气预报定时任务 cron 默认60秒执行一次
     */
    public static String WEATHER_SYNC_CRON = "0/60 * * * * *";
}
