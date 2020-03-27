package com.zc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyConfig
 * @Description TODO
 * @Author 周超
 * @Date 2020/3/27 19:40
 * @Version 1.0
 **/
@Configuration

@ComponentScan(basePackages = {"com.zc.*"})
public class MyConfig {
}
