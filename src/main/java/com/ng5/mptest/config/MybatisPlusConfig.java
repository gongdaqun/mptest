package com.ng5.mptest.config;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.enums.IdType;
import com.ng5.mptest.injector.MySqlInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author daqun.gong
 * @version 1.0
 * @date 2019/8/16
 */

@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {

    /**
     * 分页插件配置
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    @Bean
//    public MySqlInjector mySqlInjector(){
//        return new MySqlInjector();
//    }

    @Bean
    public GlobalConfiguration globalConfiguration(){
        GlobalConfiguration globalConfiguration = new GlobalConfiguration();
        globalConfiguration.setSqlInjector(new MySqlInjector());
        return globalConfiguration;
    }

}