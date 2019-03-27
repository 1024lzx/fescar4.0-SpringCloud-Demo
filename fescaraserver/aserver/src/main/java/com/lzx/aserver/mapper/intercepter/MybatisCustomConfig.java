package com.lzx.aserver.mapper.intercepter;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import org.apache.ibatis.plugin.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
/*@ConditionalOnClass({DataSourceProperties.class})*/
public class MybatisCustomConfig {
    /*@Autowired
    private DataSourceProperties properties;*/

    @Bean
    public Interceptor customIntercepter(){
        return new TestMapperIntercepter();
    }

    /*@Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());
        return new DataSourceProxy(dataSource);
    }*/
}
