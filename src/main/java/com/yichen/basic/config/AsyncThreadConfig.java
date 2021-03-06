package com.yichen.basic.config;

import com.yichen.basic.model.AsyncThreadConfigProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Qiuxinchao
 * @version 1.0
 * @date 2021/12/29 10:53
 * @describe 异步线程池配置
 */
@Configuration
@Async
public class AsyncThreadConfig {

    @Resource
    private AsyncThreadConfigProperties properties;

    @Bean("async-1")
    @Lazy
    public ThreadPoolTaskExecutor threadPoolAsync1(){

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        executor.setCorePoolSize(properties.getCorePoolSize1());
        executor.setMaxPoolSize(properties.getMaxPoolSize1());
        executor.setKeepAliveSeconds(properties.getKeepAliveSeconds1());
        executor.setQueueCapacity(properties.getQueueCapacity1());
        executor.setThreadNamePrefix(properties.getThreadNamePrefix1());
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setAwaitTerminationSeconds(properties.getAwaitTerminationSeconds1());
        executor.initialize();

        return executor;
    }

    @Bean("async-2")
    @Lazy
    public ThreadPoolTaskExecutor threadPoolAsync2(){

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

        executor.setCorePoolSize(properties.getCorePoolSize2());
        executor.setMaxPoolSize(properties.getMaxPoolSize2());
        executor.setKeepAliveSeconds(properties.getKeepAliveSeconds2());
        executor.setQueueCapacity(properties.getQueueCapacity2());
        executor.setThreadNamePrefix(properties.getThreadNamePrefix2());
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setAwaitTerminationSeconds(properties.getAwaitTerminationSeconds2());

        executor.initialize();

        return executor;
    }


}
