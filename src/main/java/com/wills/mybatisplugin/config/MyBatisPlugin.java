package com.wills.mybatisplugin.config;

import com.wills.mybatisplugin.plugin.ExecutorPlugin;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisPlugin
 * @Date 2022/1/13 14:28
 * @Author 王帅
 * @Version 1.0
 * @Description
 */
@Configuration
public class MyBatisPlugin {

    @Bean
    public Interceptor executorPlugin(){
        return new ExecutorPlugin();
    }
}
