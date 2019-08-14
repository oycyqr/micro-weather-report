package com.oycbest.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author oyc
 * @Title: Weather
 * @ProjectName micro-weather-report-data-collection
 * @Description: 天气实体类
 * @date 2019/8/13 23:30
 */
@Data
public class Weather implements Serializable {
    private static final long serialVersionUID = -7813411018606452393L;

    private String cityid;
    private String date;
    private String week;
    private String update_time;
    private String city;
    private String cityEn;
    private String country;
    private String countryEn;
    private String wea;
    private String wea_img;
    private String tem;
    private String tem1;
    private String tem2;
    private String win;
    private String win_speed;
    private String win_meter;
    private String humidity;
    private String visibility;
    private String pressure;
    private String air;
    private String air_pm25;
    private String air_level;
    private String air_tips;
}
