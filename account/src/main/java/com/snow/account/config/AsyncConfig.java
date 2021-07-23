package com.snow.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class AsyncConfig {
    private static final int MAX_POOL_SIZE =50;
    private static final int CORE_POOL_SIZE = 20;

    @Bean("asyncTaskExecutor")
    public AsyncTaskExecutor asyncTaskExecutor() {
        ThreadPoolTaskExecutor asyncTaskExecutor = new ThreadPoolTaskExecutor();
        //配置核心线程数
        asyncTaskExecutor.setCorePoolSize(CORE_POOL_SIZE);
        //配置最大线程数
        asyncTaskExecutor.setMaxPoolSize(MAX_POOL_SIZE);
        //配置队列大小
        asyncTaskExecutor.setQueueCapacity(8888);
        //配置线程池中的线程名称前缀
        asyncTaskExecutor.setThreadNamePrefix("async-service");
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        asyncTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        asyncTaskExecutor.initialize();

        return asyncTaskExecutor;
    }
}
