package com.atguigu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {

//    @Autowired
//    DataSourceProperties dataSourceProperties;

//    @Autowired
//    DataSourceProperties2 dataSourceProperties2;

//    @Autowired
//    DataSourceProperties3 dataSourceProperties3;

//    @Autowired
//    JdbcProperties jdbcProperties;

    @Autowired
    DataSource datasource;

    @RequestMapping("/hello")
    public String hello(){
//        System.out.println("dataSourceProperties = " + dataSourceProperties);
//        System.out.println("dataSourceProperties2 = " + dataSourceProperties2);
//        System.out.println("jdbcProperties = " + jdbcProperties);
        System.out.println("dataSource = " + datasource);
        return "hello springboot1";
    }
}
