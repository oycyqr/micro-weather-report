package com.oycbest.job;

import com.oycbest.constant.WeatherConstant;
import com.oycbest.service.MicroWeatherDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * @author oyc
 * @Title: MicroWeatherDataSyncJob
 * @ProjectName micro-weather-report-data-collection
 * @Description: 采集天气预报数据 定时 30分钟更新一次 config配置
 * @date 2019/8/13 23:20
 */
@Component
@EnableScheduling
public class MicroWeatherDataSyncJob implements SchedulingConfigurer {

    private final static Logger logger = LoggerFactory.getLogger(MicroWeatherDataSyncJob.class);
    @Autowired
    private MicroWeatherDataService microWeatherDataService;


    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                //任务逻辑代码部分.
                try {
                    ThreadPoolExecutor threadPoolExecutor =
                            //corePoolSize 核心线程数
                            new ThreadPoolExecutor(10,
                                    //maximumPoolSize 最大线程数
                                    100,
                                    //keepAliveTime 线程池中超过corePoolSize数目的空闲线程最大存活时间；
                                    30,
                                    // TimeUnit keepAliveTime时间单位
                                    TimeUnit.SECONDS,
                                    //workQueue 阻塞任务队列
                                    new LinkedBlockingQueue<Runnable>(1000),
                                    //threadFactory 新建线程的工厂
                                    Executors.defaultThreadFactory(),
                                    //RejectedExecutionHandler当提交任务数超过maxmumPoolSize+workQueue之和时，
                                    // 任务会交给RejectedExecutionHandler来处理
                                    new ThreadPoolExecutor.AbortPolicy()
                            );
                    // for (final THost host : tHostList) {
                    threadPoolExecutor.submit(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                logger.info("Micro Weather Sync" + new Date());
                                microWeatherDataService.syncWeahterByCityId("101280101");
                            } catch (Exception e) {
                                logger.error("Micro Weather Sync Exception:" + e.getMessage(), e);
                            }
                        }
                    });

                    /**
                     * 如果不再需要新任务，请适当关闭threadPoolExecutor并拒绝新任务
                     */
                    threadPoolExecutor.shutdown();
                } catch (Exception e) {
                    logger.error("Micro Weather Sync Exception:" + e.getMessage(), e);
                }
            }
        };
        Trigger trigger = new Trigger() {
            @Override
            public Date nextExecutionTime(TriggerContext triggerContext) {
                CronTrigger trigger = new CronTrigger(WeatherConstant.WEATHER_SYNC_CRON);
                Date nextExec = trigger.nextExecutionTime(triggerContext);
                return nextExec;
            }
        };
        scheduledTaskRegistrar.addTriggerTask(task, trigger);
    }

}
