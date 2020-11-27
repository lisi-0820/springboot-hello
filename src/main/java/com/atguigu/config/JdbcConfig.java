package com.atguigu.config;

import com.atguigu.bean.DataSourceProperties3;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JdbcConfig {

    @Bean
//    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public DataSourceProperties3 dataSourceProperties3(){
        return new DataSourceProperties3();
    }
}
