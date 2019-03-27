package com.lzx.fescarinfrustructor.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fescar.rm.datasource.DataSourceProxy;
import com.alibaba.fescar.spring.annotation.GlobalTransactionScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConditionalOnClass({DataSourceProperties.class})
public class CustomMybatisConfig {
    @Autowired(required = false)
    private DataSourceProperties properties;

    @Bean
    @ConditionalOnProperty(prefix = "spring.datasource",name = {"url"})
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(properties.getUrl());
        druidDataSource.setUsername(properties.getUsername());
        druidDataSource.setPassword(properties.getPassword());
        return new DataSourceProxy(druidDataSource);
    }

    @Bean
    public GlobalTransactionScanner scanner(){
        return new GlobalTransactionScanner("fescar-test","my_test_tx_group");
    }
}
